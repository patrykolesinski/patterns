package com.design.patterns.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Asus on 03.10.2017.
 */
public class PaymentProxy implements BankAccountPayments {

    Map<Client.AccountType, BankAccountPayments> accounts = new HashMap<Client.AccountType, BankAccountPayments>();

    public PaymentProxy(StudentAccount studentAccount, AdultAccount adultAccount, PremiumAccount premiumAccount) {
        accounts.put(Client.AccountType.ADULT, adultAccount);
        accounts.put(Client.AccountType.PREMIUM, premiumAccount);
        accounts.put(Client.AccountType.STUDENT, studentAccount);
    }

    public int computePayment(Client client) {
        return getInstance(client).computePayment(client);
    }

    private BankAccountPayments getInstance(Client client){
        return accounts.get(client.getAccountType());
    }
}
