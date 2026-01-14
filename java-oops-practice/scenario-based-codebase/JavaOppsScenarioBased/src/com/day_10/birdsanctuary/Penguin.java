package com.day_10.birdsanctuary;

public class Penguin extends Bird implements Swimmable {

    public Penguin(String name, String id) {
        super(name, "Penguin", id);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims swiftly underwater.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Penguin | Name: " + getName() + " | ID: " + getId() + " | Can Swim");
    }
}