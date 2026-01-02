package com.day_2.ewalletapp;

import java.util.ArrayList;
import java.util.List;

public abstract class Wallet implements Transferrable {

    private double balance; // encapsulated
    protected List<Transaction> history;

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
        this.history = new ArrayList<>();
    }

    protected void credit(double amount) {
        balance += amount;
        history.add(new Transaction("Credit", amount));
    }

    protected boolean debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            history.add(new Transaction("Debit", amount));
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public void showHistory() {
        for (Transaction t : history) {
            System.out.println(t);
        }
    }
}
