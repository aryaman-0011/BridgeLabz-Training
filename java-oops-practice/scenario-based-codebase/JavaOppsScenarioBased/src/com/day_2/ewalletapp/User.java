package com.day_2.ewalletapp;

public class User {

    private String userId;
    private String name;
    private Wallet wallet;

    public User(String userId, String name, Wallet wallet) {
        this.userId = userId;
        this.name = name;
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }
}
