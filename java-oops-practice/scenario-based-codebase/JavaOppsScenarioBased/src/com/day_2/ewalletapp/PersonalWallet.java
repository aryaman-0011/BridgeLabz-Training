package com.day_2.ewalletapp;

public class PersonalWallet extends Wallet {

    public PersonalWallet(double initialBalance, boolean referralBonus) {
        super(initialBalance);
        if (referralBonus) {
            credit(100); // referral bonus
        }
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (debit(amount)) {
            receiver.getWallet().credit(amount);
            System.out.println("Personal transfer successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
