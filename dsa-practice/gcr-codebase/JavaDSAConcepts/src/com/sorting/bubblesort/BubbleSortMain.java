package com.sorting.bubblesort;

import java.util.Scanner;

public class BubbleSortMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter student marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        // Calling Bubble Sort method
        BubbleSort.sort(marks);

        System.out.println("Sorted student marks (Ascending Order):");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
