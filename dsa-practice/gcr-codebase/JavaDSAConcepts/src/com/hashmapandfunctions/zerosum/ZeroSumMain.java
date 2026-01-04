package com.hashmapandfunctions.zerosum;

public class ZeroSumMain {

    public static void main(String[] args) {

        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};

        System.out.println("Zero-sum subarrays:");
        ZeroSumSubarrays.findSubarrays(arr);
    }
}
