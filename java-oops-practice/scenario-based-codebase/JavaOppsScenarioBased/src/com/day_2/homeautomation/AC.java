package com.day_2.homeautomation;

public class AC extends Appliance {

    public AC(String name, int temperature) {
        super(name, temperature < 22 ? 2000 : 1500);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(name + " AC is cooling aggressively");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(name + " AC is OFF");
    }
}
