package com.day_9.homenest;

public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId);
        this.energyUsage = 0.12;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Camera " + deviceId + " is now recording");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Camera " + deviceId + " stopped recording");
    }

    @Override
    public void reset() {
        System.out.println("Camera reset: lens calibrated");
        logFirmwareUpdate("Camera firmware refreshed");
    }
}