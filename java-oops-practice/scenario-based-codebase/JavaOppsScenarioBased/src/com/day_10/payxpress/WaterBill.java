package com.day_10.payxpress;


public class WaterBill extends Bill {

    public WaterBill(double amount, int dueInDays) {
        super("Water", amount, dueInDays);
    }

    @Override
    public void pay() {
        markAsPaid();
        System.out.println("Water bill paid successfully");
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Clear water bill to avoid supply interruption");
    }
}
