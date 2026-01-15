package com.day_4.zipzipmart;

public class Sale {

    String date;      // yyyy-mm-dd
    double amount;
    String branch;
    int transactionId;

    public Sale(String date, double amount, String branch, int transactionId) {
        this.date = date;
        this.amount = amount;
        this.branch = branch;
        this.transactionId = transactionId;
    }

    public void display() {
        System.out.println(
            "Date: " + date +
            ", Amount: ₹" + amount +
            ", Branch: " + branch +
            ", TxnID: " + transactionId
        );
    }
}
