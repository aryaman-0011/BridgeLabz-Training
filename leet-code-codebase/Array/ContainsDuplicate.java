// 217. Contains Duplicate

import java.util.Scanner;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> track = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) {
                return true;
            } else {
                track.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = containsDuplicate(nums);

        // Output result
        System.out.println("Contains duplicate: " + result);
    }
}
