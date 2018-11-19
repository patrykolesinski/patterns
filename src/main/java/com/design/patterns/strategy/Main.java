package com.design.patterns.strategy;

/**
 * Created by Asus on 03.10.2017.
 */
public class Main {
    public static void main(String[] args) {

        BankAccountPayments payments = new PaymentProxy(new StudentAccount(), new AdultAccount(), new PremiumAccount());

        Client client = new Client(12, 31, Client.AccountType.ADULT);

        int i = payments.computePayment(client);

        System.out.println(i);
    }
}
