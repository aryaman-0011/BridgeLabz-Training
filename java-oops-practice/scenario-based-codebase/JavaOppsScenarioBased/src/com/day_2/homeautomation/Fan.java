package com.day_2.homeautomation;

public class Fan extends Appliance {

    public Fan(String name, int speedLevel) {
        super(name, speedLevel * 40);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(name + " fan is spinning");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(name + " fan is stopped");
    }
}
