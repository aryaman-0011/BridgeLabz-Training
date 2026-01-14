package com.day_10.payxpress;


public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, int dueInDays) {
        super("Electricity", amount, dueInDays);
    }

    @Override
    public void pay() {
        markAsPaid();
        System.out.println("Electricity bill paid successfully");
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Pay your electricity bill before power disconnection!");
    }
}
