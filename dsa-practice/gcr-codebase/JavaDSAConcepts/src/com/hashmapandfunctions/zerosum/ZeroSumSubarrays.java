package com.hashmapandfunctions.zerosum;

import java.util.*;

public class ZeroSumSubarrays {

    public static void findSubarrays(int[] arr) {

        // Map to store prefix sum and list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        // Base case: sum = 0 at index -1
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // If sum already exists, subarrays found
            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    System.out.println(
                        "Subarray found from index " + (startIndex + 1) + " to " + i
                    );
                }
            }

            // Add current index to the map
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }
}
