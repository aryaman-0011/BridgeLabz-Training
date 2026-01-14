package com.day_10.birdsanctuary;

public class Ostrich extends Bird {

    public Ostrich(String name, String id) {
        super(name, "Ostrich", id);
    }

    @Override
    public void displayInfo() {
        System.out.println("Ostrich | Name: " + getName() + " | ID: " + getId() + " | Cannot Fly or Swim");
    }
}