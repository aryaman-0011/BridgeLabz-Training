package com.sorting.mergesort;

import java.util.Scanner;

public class MergeSortMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter book prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Calling Merge Sort
        MergeSort.sort(prices);

        System.out.println("Sorted Book Prices (Ascending Order):");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}
