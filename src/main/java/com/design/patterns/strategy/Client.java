package com.design.patterns.strategy;

/**
 * Created by Asus on 03.10.2017.
 */
public class Client {
    private int age;
    private int account;
    private AccountType accountType;

    public Client(int age, int account, AccountType accountType) {
        this.age = age;
        this.account = account;
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public enum AccountType {
        PREMIUM, STUDENT, ADULT
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }


}
