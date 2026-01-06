package com.sorting.countingsort;

import java.util.Scanner;

public class CountingSortMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];

        System.out.println("Enter student ages (10 to 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        // Calling Counting Sort
        CountingSort.sort(ages);

        System.out.println("Sorted Student Ages (Ascending Order):");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
