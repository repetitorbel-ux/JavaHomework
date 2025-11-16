package org.example.task16;

import java.util.Objects;

public class Account {
    private Integer id;
    private String accountNumber;
    private String accountCurrency;
    private Double accountSum;

    //Конструктор
    public Account(Integer id, String accountNumber, String accountCurrency, Double accountSum) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountCurrency = accountCurrency;
        this.accountSum = accountSum;
    }

    public Account(String accountNumber, String accountCurrency, Double accountSum) {
        this.accountNumber = accountNumber;
        this.accountCurrency = accountCurrency;
        this.accountSum = accountSum;
    }

    public Account() {

    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Account account)) return false;
        return Objects.equals(id, account.id) && Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountCurrency='" + accountCurrency + '\'' +
                ", accountSum=" + accountSum +
                '}';
    }

    //Геттеры
    public Integer getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public Double getAccountSum() {
        return accountSum;
    }

    //Сеттеры

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public void setAccountSum(Double accountSum) {
        this.accountSum = accountSum;
    }
}
/*
1. Создать класс счёт (Account). Поля идентификатор счёта (id), номер счёта, валюта счёт (String), сумма счёта (Double). Выполнить переопределение equals и hashcode по двум полям (id и номер счёта), так как логически, эти поля будут уникальными для каждого счёта.
 */