package org.example.task16;

import org.example.task16.Exceptions.AccountNotFoundException;
import org.example.task16.Exceptions.NotCorrectAmountException;
import org.example.task16.Exceptions.NotEnoughMoneyException;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bank {
    private Set<Account> accounts;

    //Конструкторы
    public Bank(Set<Account> accounts) {
        this.accounts = new HashSet<>();
    }

    public Bank() {
        this.accounts = new HashSet<>();
    }

    //Метод проверки наличия счета в банке
    public Account findAccountByNumber(String accountNumber) {
        for (Account a : accounts) {
            if (a.getAccountNumber().equals(accountNumber)) {
                return a;
            }
        }
        return null;
    }

    //Метод перевода денег между счетами в одной валюте
    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
        Account accFrom = findAccountByNumber(accountNumberFrom);
        Account accTo = findAccountByNumber(accountNumberTo);

        //Проверка суммы на равенство нулю или меньше нуля
        if (amount <= 0) {
            throw new NotCorrectAmountException("not.correct.amount");
        }

        //Проверка отсутствия счета в банке
        if (accFrom == null || accTo == null) {
            throw new AccountNotFoundException("not found account");
        }
        System.out.println("*************************************************");

        //Проверка на доступность денег на счету, с которого осуществляется перевод
        double moneyFrom = accFrom.getAccountSum();
        if (moneyFrom < amount) {
            throw new NotEnoughMoneyException("not.enough.money");
        }

        //Списание со счета
        double newBalanceFrom = moneyFrom - amount;
        accFrom.setAccountSum(newBalanceFrom);

        //Пополнение счета
        double sumInAccountTo = accTo.getAccountSum();
        double newBalanceTo = sumInAccountTo + amount;
        accTo.setAccountSum(newBalanceTo);

        System.out.println("---------- ВЫПИСКА О ПЕРЕВОДЕ ----------");
        System.out.println("Дата " + LocalDateTime.now());
        System.out.println("Операция: Перевод между счетами");
        System.out.println("Отправитель: " + accFrom.getAccountNumber());
        System.out.println("Получатель: " + accTo.getAccountNumber());
        System.out.println("Сумма перевода: " + amount);
        System.out.println("Остаток отправителя: " + newBalanceFrom + " " + accFrom.getAccountCurrency());
        System.out.println("Остаток получателя: " + newBalanceTo + " " + accTo.getAccountCurrency());
//        System.out.println("Перевод на сумму " + amount + " выполнен успешно");
//        System.out.println("Счет-отправитель " + accFrom.getAccountNumber() + ", остаток  " + newBalanceFrom + " " + accFrom.getAccountCurrency());
//        System.out.println("Счет-получатель " + accTo.getAccountNumber() + ", остаток  " + newBalanceTo + " " + accTo.getAccountCurrency());
        System.out.println("*************************************************");
    }

    //Переопределенный метод перевода денег между счетами в разных валютах
    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate) {
        Account accFrom = findAccountByNumber(accountNumberFrom);
        Account accTo = findAccountByNumber(accountNumberTo);

        if (amount <= 0) {
            throw new NotCorrectAmountException("not.correct.amount");
        }

        if (accFrom == null || accTo == null) {
            throw new AccountNotFoundException("not found account");
        }
        System.out.println("*************************************************");
        double moneyFrom = accFrom.getAccountSum();

        //Записываем в переменную тип валюты счета с которого будет перевод
        String currencyFrom = accFrom.getAccountCurrency();
        //Записываем в переменную тип валюты счета на который будет перевод
        String currencyTo = accTo.getAccountCurrency();

       //Проверка на соответствие типа валюты
        if(currencyFrom.equals(currencyTo)){//Если валюта одинакова
            transferMoney(accountNumberFrom, accountNumberTo, amount);//вызываем соответствующий метод
        }
        //Ветвление для случая разных валют: если перевод со счета BYN, то эквивалентная сумма перевода делиться на курс; если "Не BYN" - умножается ( внутр.блок else)
        else {
            if (currencyFrom.equals("BYN")) {
                double amountWithRate = amount / exchangeRate;
                if (moneyFrom < amountWithRate) {
                    throw new NotEnoughMoneyException("not.enough.money");
                }
                double newBalanceFrom = moneyFrom - amount;
                accFrom.setAccountSum(newBalanceFrom);

                double sumInAccountTo = accTo.getAccountSum();
                double newBalanceTo = sumInAccountTo + amountWithRate;
                accTo.setAccountSum(newBalanceTo);

                System.out.println("Перевод на сумму " + amountWithRate + " " + currencyFrom + " выполнен успешно");
                System.out.println("Счет-отправитель " + accFrom.getAccountNumber() + ", остаток  " + newBalanceFrom + " " + accFrom.getAccountCurrency());
                System.out.println("Счет-получатель " + accTo.getAccountNumber() + ", остаток  " + newBalanceTo + " " + accTo.getAccountCurrency());
            } else {
                double amountWithRate = amount * exchangeRate;
                if (moneyFrom < amountWithRate) {
                    throw new NotEnoughMoneyException("not.enough.money");
                }
                double newBalanceFrom = moneyFrom - amount;
                accFrom.setAccountSum(newBalanceFrom);

                double sumInAccountTo = accTo.getAccountSum();
                double newBalanceTo = sumInAccountTo + amountWithRate;
                accTo.setAccountSum(newBalanceTo);

                System.out.println("Перевод на сумму " + amount + " " + currencyFrom + " выполнен успешно");
                System.out.println("Счет-отправитель " + accFrom.getAccountNumber() + ", остаток  " + newBalanceFrom + " " + accFrom.getAccountCurrency());
                System.out.println("Счет-получатель " + accTo.getAccountNumber() + ", остаток  " + newBalanceTo + " " + accTo.getAccountCurrency());
            }
        }
    }

    //**********
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bank bank)) return false;
        return Objects.equals(accounts, bank.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(accounts);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }
}
/*
2. Создать класс Банк.  В классе банка будет одно поле: коллекция из счетов (Set<Account> accounts)
5. В классе банк реализовать метод перевода денежных средств с одного счёта на другой. Сигнатура метода будет такая:
public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount)
5.1 Если в банке отсутствует номер счёта с которого переводят деньги или номер счёта куда переводят деньги, выбрасывает своё исключение
AccountNotFoundException с errorCode= not.found.account
5.2 Если на счёте, с которого переводят деньги, сумма меньше переводимой то выбросить своё исключение NotEnoughMoneyException с errorCode=not.enough.money.
5.3  Соответственно выполните логику перевода денег в белорусской валюте (отнимаете переводимую сумму со счёта, с которого идёт перевод и прибавляете сумму перевода счёту, на который происходит перевод. При этом сначала надо найти счета по переданным номерам в банке.

9. *В классе банк реализуйте метод перевода денег со счёта на счёт, который будет работать со счетами, у которых разные валюты (USD и BYN). Сигнатура метода такая:
public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate). exchangeRate это курсовая разница между доларом и белорусским рублём. Проверки выполните те же что и в пункте 5.
 */
