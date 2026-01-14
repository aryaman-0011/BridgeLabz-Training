package com.day_10.birdsanctuary;

public abstract class Bird {

    private String name;
    private String species;
    private String id;

    protected Bird(String name, String species, String id) {
        this.name = name;
        this.species = species;
        this.id = id;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public abstract void displayInfo();
}