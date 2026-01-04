package com.hashmapandfunctions.pairwithsum;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {

    public static boolean hasPair(int[] arr, int target) {

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {

            int needed = target - num;

            if (set.contains(needed)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
