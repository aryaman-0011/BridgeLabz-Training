package com.day_9.homenest;

public class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId);
        this.energyUsage = 1.5;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat " + deviceId + " regulating temperature");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat " + deviceId + " turned OFF");
    }

    @Override
    public void reset() {
        System.out.println("Thermostat reset: temperature set to 24°C");
    }
}
