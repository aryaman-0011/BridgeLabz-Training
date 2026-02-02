package com.optionalclass.scenario3;

import java.util.Optional;

public class Customer {

    private String name;
    private String loanDetails;
    private String transactionRef;

    public Customer(String name, String loanDetails, String transactionRef) {
        this.name = name;
        this.loanDetails = loanDetails;
        this.transactionRef = transactionRef;
    }

    public String getName() { return name; }

    public Optional<String> getLoanDetails() {
        return Optional.ofNullable(loanDetails);
    }

    public Optional<String> getTransactionRef() {
        return Optional.ofNullable(transactionRef);
    }
}
