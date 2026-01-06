package com.sorting.insertionsort;

import java.util.Scanner;

public class InsertionSortMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] empIds = new int[n];

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            empIds[i] = sc.nextInt();
        }

        // Calling Insertion Sort
        InsertionSort.sort(empIds);

        System.out.println("Sorted Employee IDs (Ascending Order):");
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}
