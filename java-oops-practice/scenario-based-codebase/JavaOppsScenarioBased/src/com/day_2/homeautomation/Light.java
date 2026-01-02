package com.day_2.homeautomation;

public class Light extends Appliance {

    public Light(String name) {
        super(name, 60); // default wattage
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(name + " light is ON (soft glow)");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(name + " light is OFF");
    }
}
