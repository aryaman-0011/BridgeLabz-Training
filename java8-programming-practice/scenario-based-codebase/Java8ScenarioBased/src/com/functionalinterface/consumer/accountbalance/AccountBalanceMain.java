package com.functionalinterface.consumer.accountbalance;

import java.util.function.Consumer;

public class AccountBalanceMain {

    public static void main(String[] args) {

        Account a1 = new Account(9001, "Aryaman", 15420.75);
        Account a2 = new Account(9002, "Aryan", 8200.50);

        Consumer<Account> showBalance = acc -> {
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Available Balance: ₹" + acc.getBalance());
            System.out.println();
        };

        showBalance.accept(a1);
        showBalance.accept(a2);
    }
}
