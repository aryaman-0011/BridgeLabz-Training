package com.algorithmsruntimebigo.problem6;

import java.util.*;

public class SearchComparison {

    // Linear Search in Array
    public static boolean arraySearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // Utility: Generate Data
    public static int[] generateArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
