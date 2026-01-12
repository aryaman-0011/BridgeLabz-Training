package com.day_9.homenest;


public class HomeNestMain {

    public static void main(String[] args) {

        Device light = new Light("L101");
        Device camera = new Camera("C202");
        Device thermostat = new Thermostat("T303");
        Device lock = new Lock("K404");

        light.turnOn();
        camera.turnOn();

        System.out.println("Monthly Light Usage: " +
                light.calculateMonthlyUsage(5) + " units");

        camera.reset();
        lock.reset();
    }
}
