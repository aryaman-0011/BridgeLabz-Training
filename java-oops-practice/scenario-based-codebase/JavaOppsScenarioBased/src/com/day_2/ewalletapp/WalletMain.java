package com.day_2.ewalletapp;

public class WalletMain {

    public static void main(String[] args) {

        User u1 = new User("U1", "Aryaman",
                new PersonalWallet(1000, true));

        User u2 = new User("U2", "Ravi",
                new BusinessWallet(2000));

        u1.getWallet().transferTo(u2, 500);
        u2.getWallet().transferTo(u1, 300);

        System.out.println("\nAryaman Balance: ₹" + u1.getWallet().getBalance());
        System.out.println("Ravi Balance: ₹" + u2.getWallet().getBalance());
    }
}
