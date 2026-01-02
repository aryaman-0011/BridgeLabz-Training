package com.day_2.homeautomation;

public abstract class Appliance implements Controllable {

    protected String name;
    private boolean isOn;
    private int powerUsage; // watts

    public Appliance(String name, int powerUsage) {
        this.name = name;
        this.powerUsage = powerUsage;
        this.isOn = false;
    }

    protected void setOn(boolean status) {
        this.isOn = status;
    }

    protected int getPowerUsage() {
        return powerUsage;
    }

    public boolean isOn() {
        return isOn;
    }
}
