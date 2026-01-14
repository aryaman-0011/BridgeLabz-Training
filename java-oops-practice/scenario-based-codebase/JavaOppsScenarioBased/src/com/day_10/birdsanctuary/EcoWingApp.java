package com.day_10.birdsanctuary;


import java.util.Scanner;

public class EcoWingApp {

    public static void main(String[] args) {

        BirdSanctuary sanctuary = new BirdSanctuary();
        Scanner sc = new Scanner(System.in);

        sanctuary.addBird(new Eagle("Alpha", "E1"));
        sanctuary.addBird(new Duck("Daisy", "D1"));
        sanctuary.addBird(new Penguin("Pingu", "P1"));
        sanctuary.addBird(new Ostrich("Ozzy", "O1"));

        while (true) {
            System.out.println("\nWelcome to EcoWing Bird Sanctuary");
            System.out.println("1. Display All Birds");
            System.out.println("2. Display Flying Birds");
            System.out.println("3. Display Swimming Birds");
            System.out.println("4. Remove Bird by ID");
            System.out.println("5. Sanctuary Report");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> sanctuary.displayAllBirds();
                case 2 -> sanctuary.displayFlyingBirds();
                case 3 -> sanctuary.displaySwimmingBirds();
                case 4 -> {
                    System.out.print("Enter ID: ");
                    sanctuary.removeBirdById(sc.next());
                }
                case 5 -> sanctuary.sanctuaryReport();
                case 6 -> {
                    System.out.println("Thank you for protecting wildlife!");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}