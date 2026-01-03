package com.day_3.cabbygo;

public class Vehicle {

    private String vehicleNumber;
    private int capacity;
    private String type;

    protected double ratePerKm;   // used by subclasses

    public Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
}
