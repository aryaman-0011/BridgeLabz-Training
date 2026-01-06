package com.sorting.heapsort;

public class HeapSort {

    // Public method to start heap sort
    public static void sort(int[] salaries) {

        int n = salaries.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Step 2: Extract elements one by one
        for (int i = n - 1; i > 0; i--) {

            // Swap root with last element
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Heapify reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Heapify a subtree rooted at index i
    private static void heapify(int[] arr, int size, int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger
        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger
        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        // If root is not largest
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify affected subtree
            heapify(arr, size, largest);
        }
    }
}
