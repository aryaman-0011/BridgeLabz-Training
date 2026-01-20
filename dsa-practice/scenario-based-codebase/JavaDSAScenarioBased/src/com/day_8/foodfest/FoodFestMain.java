package com.day_8.foodfest;


public class FoodFestMain {

    public static void main(String[] args) {

        // Zone-wise data (already sorted)
        Stall[] stalls = {
            new Stall("Burger King", 120),
            new Stall("Pizza Hut", 180),
            new Stall("Taco Bell", 240),

            new Stall("Noodle Point", 100),
            new Stall("Curry Corner", 160),
            new Stall("Dosa Delight", 220)
        };

        System.out.println("Before Merge Sort:");
        print(stalls);

        MergeSort.mergeSort(stalls, 0, stalls.length - 1);

        System.out.println("\nAfter Merge Sort (Master List):");
        print(stalls);
    }

    private static void print(Stall[] stalls) {
        for (Stall s : stalls) {
            System.out.println(s);
        }
    }
}

