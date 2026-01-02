package com.day_2.ewalletapp;

public class BusinessWallet extends Wallet {

    private static final double TAX = 0.02; // 2% tax

    public BusinessWallet(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double taxAmount = amount * TAX;
        double totalDeduction = amount + taxAmount;

        if (debit(totalDeduction)) {
            receiver.getWallet().credit(amount);
            System.out.println("Business transfer successful (Tax applied)");
        } else {
            System.out.println("Insufficient balance (including tax)");
        }
    }
}
