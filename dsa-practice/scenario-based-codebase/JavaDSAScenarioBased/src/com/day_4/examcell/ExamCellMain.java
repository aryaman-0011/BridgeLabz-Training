/*
5. ExamCell – Student Rank Generator (Merge Sort)
Story: An online exam system collects scores from multiple test centers. To publish a
state-level rank list, student scores are merged and sorted using Merge Sort, ensuring
performance and accuracy.
Key Concepts:
● Merging pre-sorted center-wise scores
● Sorting across centers
● High efficiency for big data
 */

package com.day_4.examcell;

import java.util.Arrays;

public class ExamCellMain {

    public static void main(String[] args) {

        int[] allScores = {
            35, 48, 72, 90,
            40, 55, 60, 88,
            30, 50, 70, 95
        };

        MergeSort.mergeSort(allScores, 0, allScores.length - 1);

        System.out.println("State-Level Rank List:");
        System.out.println(Arrays.toString(allScores));
    }
}
