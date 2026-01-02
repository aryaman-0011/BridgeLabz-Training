package com.day_2.homeautomation;

public class UserController {

    public void operateDevice(Controllable device, boolean power) {
        if (power) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    public void compareUsage(Appliance a1, Appliance a2) {
        if (a1.getPowerUsage() > a2.getPowerUsage()) {
            System.out.println(a1.name + " uses more power");
        } else if (a1.getPowerUsage() < a2.getPowerUsage()) {
            System.out.println(a2.name + " uses more power");
        } else {
            System.out.println("Both use equal power");
        }
    }
}
