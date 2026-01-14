package com.day_10.birdsanctuary;


public class Duck extends Bird implements Flyable, Swimmable {

    public Duck(String name, String id) {
        super(name, "Duck", id);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flies short distances.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims gracefully.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Duck | Name: " + getName() + " | ID: " + getId() + " | Can Fly & Swim");
    }
}