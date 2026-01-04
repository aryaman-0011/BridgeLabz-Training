package com.hashmapandfunctions.pairwithsum;

public class PairSumMain {

    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        boolean result = PairWithGivenSum.hasPair(arr, target);

        if (result) {
            System.out.println("Pair with given sum exists");
        } else {
            System.out.println("No pair with given sum exists");
        }
    }
}
