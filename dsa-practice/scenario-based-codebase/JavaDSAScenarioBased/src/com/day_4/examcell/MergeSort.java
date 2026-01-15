package com.day_4.examcell;

public class MergeSort {

    static void merge(int[] scores, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = scores[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = scores[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                scores[k++] = L[i++];
            } else {
                scores[k++] = R[j++];
            }
        }

        while (i < n1) {
            scores[k++] = L[i++];
        }

        while (j < n2) {
            scores[k++] = R[j++];
        }
    }

    static void mergeSort(int[] scores, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(scores, left, mid);
            mergeSort(scores, mid + 1, right);

            merge(scores, left, mid, right);
        }
    }
}
