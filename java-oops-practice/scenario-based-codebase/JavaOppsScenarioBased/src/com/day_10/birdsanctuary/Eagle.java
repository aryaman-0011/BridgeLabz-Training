package com.day_10.birdsanctuary;

public class Eagle extends Bird implements Flyable {

    public Eagle(String name, String id) {
        super(name, "Eagle", id);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " soars high in the sky.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Eagle | Name: " + getName() + " | ID: " + getId() + " | Can Fly");
    }
}