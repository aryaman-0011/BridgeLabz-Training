package com.day_9.homenest;

public class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId);
        this.energyUsage = 0.01;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Lock " + deviceId + " locked");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Lock " + deviceId + " unlocked");
    }

    @Override
    public void reset() {
        System.out.println("Lock reset: security keys regenerated");
        logFirmwareUpdate("Lock security patch applied");
    }
}
