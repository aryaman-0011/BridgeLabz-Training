package com.hashmapandfunctions.consecutivesequence;

public class LongestSequenceMain {

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        int length = LongestConsecutiveSequence.longestConsecutive(arr);

        System.out.println("Length of longest consecutive sequence: " + length);
    }
}
