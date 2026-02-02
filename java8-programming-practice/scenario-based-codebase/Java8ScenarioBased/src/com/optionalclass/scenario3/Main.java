package com.optionalclass.scenario3;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC123", null, null, "VISA-9988");
        Customer customer = new Customer("Aryan", null, "TXN202502");

        // Nominee handling
        System.out.println("Nominee: " +
                account.getNominee().orElse("No Nominee Added"));

        // Loan details
        System.out.println("Loan Details: " +
                customer.getLoanDetails().orElse("No Loan"));

        // Balance or minimum balance
        System.out.println("Balance: " +
                account.getBalance().orElse(BankingService.MIN_BALANCE));

        // Transaction reference safely
        System.out.println("Transaction Ref: " +
                customer.getTransactionRef().orElse("No Transaction Ref"));

        // Credit card details only if present
        account.getCreditCard()
                .ifPresent(c -> System.out.println("Credit Card: " + c));
    }
}
