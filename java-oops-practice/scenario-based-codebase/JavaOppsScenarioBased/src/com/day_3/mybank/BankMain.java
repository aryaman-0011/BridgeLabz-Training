package com.day_3.mybank;

public class BankMain {

    public static void main(String[] args) {

        Account savings = new SavingsAccount("SB101", 10000);
        Account current = new CurrentAccount("CA202", 20000);

        savings.deposit(2000);
        current.withdraw(5000);

        System.out.println("Savings Balance: ₹" + savings.checkBalance());
        System.out.println("Savings Interest: ₹" + savings.calculateInterest());

        System.out.println();

        System.out.println("Current Balance: ₹" + current.checkBalance());
        System.out.println("Current Interest: ₹" + current.calculateInterest());
    }
}
