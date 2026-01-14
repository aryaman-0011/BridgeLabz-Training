package com.day_10.payxpress;


public class InternetBill extends Bill {

    public InternetBill(double amount, int dueInDays) {
        super("Internet", amount, dueInDays);
    }

    @Override
    public void pay() {
        markAsPaid();
        System.out.println("Internet bill paid successfully");
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Internet service will be suspended if unpaid");
    }
}
