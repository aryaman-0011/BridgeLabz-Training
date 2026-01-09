package com.algorithmsruntimebigo.problem2;

public class SortingComparisonMain {

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};

        for (int size : sizes) {
            System.out.println("\nDataset Size: " + size);

            int[] original = SortingComparison.generateArray(size);

            // Bubble Sort
            if (size <= 10000) { // avoid >1hr execution
                int[] bubbleArr = original.clone();
                long start = System.currentTimeMillis();
                SortingComparison.bubbleSort(bubbleArr);
                long end = System.currentTimeMillis();
                System.out.println("Bubble Sort: " + (end - start) + " ms");
            } else {
                System.out.println("Bubble Sort: Unfeasible (>1 hr)");
            }

            // Merge Sort
            int[] mergeArr = original.clone();
            long startMerge = System.currentTimeMillis();
            SortingComparison.mergeSort(mergeArr, 0, mergeArr.length - 1);
            long endMerge = System.currentTimeMillis();
            System.out.println("Merge Sort: " + (endMerge - startMerge) + " ms");

            // Quick Sort
            int[] quickArr = original.clone();
            long startQuick = System.currentTimeMillis();
            SortingComparison.quickSort(quickArr, 0, quickArr.length - 1);
            long endQuick = System.currentTimeMillis();
            System.out.println("Quick Sort: " + (endQuick - startQuick) + " ms");
        }
    }
}
