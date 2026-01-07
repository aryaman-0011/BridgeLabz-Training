package com.day_6.parkease;

class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 20);
    }

    @Override
    public double calculateCharges(int hours) {
        return baseRate * hours;
    }
}
