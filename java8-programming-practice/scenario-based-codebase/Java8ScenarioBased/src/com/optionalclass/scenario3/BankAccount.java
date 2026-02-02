package com.optionalclass.scenario3;

import java.util.Optional;

public class BankAccount {

    private String accountNumber;
    private Double balance;
    private String nominee;
    private String creditCard;

    public BankAccount(String accountNumber, Double balance, String nominee, String creditCard) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.nominee = nominee;
        this.creditCard = creditCard;
    }

    public String getAccountNumber() { return accountNumber; }

    public Optional<Double> getBalance() {
        return Optional.ofNullable(balance);
    }

    public Optional<String> getNominee() {
        return Optional.ofNullable(nominee);
    }

    public Optional<String> getCreditCard() {
        return Optional.ofNullable(creditCard);
    }
}
