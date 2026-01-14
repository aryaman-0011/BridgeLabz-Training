package com.day_10.birdsanctuary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BirdSanctuary {

    private List<Bird> birds = new ArrayList<>();

    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public void displayAllBirds() {
        for (Bird bird : birds) {
            bird.displayInfo();
            bird.eat();
        }
    }

    public void displayFlyingBirds() {
        for (Bird bird : birds) {
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            }
        }
    }

    public void displaySwimmingBirds() {
        for (Bird bird : birds) {
            if (bird instanceof Swimmable) {
                ((Swimmable) bird).swim();
            }
        }
    }

    public void removeBirdById(String id) {
        Iterator<Bird> iterator = birds.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId().equals(id)) {
                iterator.remove();
                System.out.println("Bird removed successfully.");
                return;
            }
        }
        System.out.println("Bird not found.");
    }

    public void sanctuaryReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird bird : birds) {
            boolean canFly = bird instanceof Flyable;
            boolean canSwim = bird instanceof Swimmable;

            if (canFly && canSwim) both++;
            else if (canFly) fly++;
            else if (canSwim) swim++;
            else neither++;
        }

        System.out.println("---- Sanctuary Report ----");
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }
}