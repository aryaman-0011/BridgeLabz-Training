package com.day_3.mybank;

public class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 1.0;

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return checkBalance() * INTEREST_RATE / 100;
    }
}
