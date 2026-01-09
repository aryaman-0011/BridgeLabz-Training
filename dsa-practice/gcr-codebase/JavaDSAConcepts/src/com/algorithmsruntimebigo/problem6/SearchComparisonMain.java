package com.algorithmsruntimebigo.problem6;

import java.util.*;

public class SearchComparisonMain {

    public static void main(String[] args) {

        int[] sizes = {1_000, 100_000, 1_000_000};

        for (int size : sizes) {
            System.out.println("\nDataset Size: " + size);

            int[] array = SearchComparison.generateArray(size);
            int target = size - 1; // worst-case for array

            // Prepare HashSet & TreeSet
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int value : array) {
                hashSet.add(value);
                treeSet.add(value);
            }

            // ---------- Array Search ----------
            long startArray = System.currentTimeMillis();
            SearchComparison.arraySearch(array, target);
            long endArray = System.currentTimeMillis();
            System.out.println("Array Search: " + (endArray - startArray) + " ms");

            // ---------- HashSet Search ----------
            long startHash = System.nanoTime();
            hashSet.contains(target);
            long endHash = System.nanoTime();
            System.out.println("HashSet Search: " +
                    (endHash - startHash) / 1_000_000.0 + " ms");

            // ---------- TreeSet Search ----------
            long startTree = System.nanoTime();
            treeSet.contains(target);
            long endTree = System.nanoTime();
            System.out.println("TreeSet Search: " +
                    (endTree - startTree) / 1_000_000.0 + " ms");
        }
    }
}
