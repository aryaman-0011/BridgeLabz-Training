package com.day_10.payxpress;


public class PayXpressMain {

    public static void main(String[] args) {

        Bill electricity = new ElectricityBill(1200, 10);
        Bill water = new WaterBill(600, 5);
        Bill internet = new InternetBill(999, 3);

        electricity.sendReminder();
        internet.sendReminder();

        electricity.pay();

        System.out.println("Electricity bill paid? " + electricity.isPaid());
        System.out.println("Late fee example: " +
                electricity.calculateLateFee(100));
    }
}
