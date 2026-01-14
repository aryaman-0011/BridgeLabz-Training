package com.day_10.payxpress;


import java.time.LocalDate;

public abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected LocalDate dueDate;

    private boolean isPaid;

    protected Bill(String type, double amount, int dueInDays) {
        this.type = type;
        this.amount = amount;
        this.dueDate = LocalDate.now().plusDays(dueInDays);
        this.isPaid = false;
    }

    protected void markAsPaid() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    protected double calculateLateFee(double penalty) {
        return amount + penalty;
    }
}
