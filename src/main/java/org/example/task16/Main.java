package org.example.task16;

import org.example.task16.Exceptions.AccountNotFoundException;
import org.example.task16.Exceptions.NotCorrectAmountException;
import org.example.task16.Exceptions.NotEnoughMoneyException;

public class Main {
    public static void main(String[] args) {

        //Создание банка и "открытие" счетов
        Bank bank = new Bank();

        Account account1 = new Account(1, "310140000556501", "BYN", 1000.0);
        Account account2 = new Account(2, "310140000556502", "BYN", 2000.0);
        Account account3 = new Account(3, "310140000556503", "USD", 3000.0);
        Account account4 = new Account(4, "310140000556504", "BYN", 2000.0);

        bank.getAccounts().add(account1);
        bank.getAccounts().add(account2);
        bank.getAccounts().add(account3);
        bank.getAccounts().add(account4);

        //bank.findAccountByNumber("310140000556502");
        try {
            bank.transferMoney("310140000556501", "310140000556503", 900.0, 3.0);
        } catch (AccountNotFoundException accountNotFoundException) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException notEnoughMoneyException) {
            System.out.println("Недостаточно средств для перевода");
        } catch (NotCorrectAmountException notCorrectAmountException) {
            System.out.println("Некорректная сумма перевода");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка");
        }

        //
    }
}
/*
6. В классе Main создайте пять счетов. Добавьте эти счета в банк (класс Bank)
7. В классе Main в блоке try catch выполните вызов метода по переводу денег со счёта на счёт. При этом выполните обработку вашего выбрасываемого исключения в двух блоках catch
7.1 Если пришло исключение AccountNotFoundException то выведите в консоль «Откройте счёт в нашем банке для выполнения переводов»
7.2 Если пришло исключение NotEnoughMoneyException то выведите в консоль «Недостаточно средств для перевода»
7.3 В обоих случаях не пробрасывайте исключения дальше. Программа должна продолжать работу.
8. Добавьте блок finally. В блоке finally выведите в консоли «Спасибо, что воспользовались услугами банка»
 */
//            bank.transferMoney("310140000556501", "310140000556502", 300.0);