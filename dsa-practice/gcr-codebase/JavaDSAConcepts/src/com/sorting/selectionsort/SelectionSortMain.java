package com.sorting.selectionsort;

import java.util.Scanner;

public class SelectionSortMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // Calling Selection Sort
        SelectionSort.sort(scores);

        System.out.println("Sorted Exam Scores (Ascending Order):");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}

