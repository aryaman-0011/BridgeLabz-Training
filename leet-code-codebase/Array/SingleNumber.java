// 136. Single Number

import java.util.Scanner;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int res = 0;

        for (int num : nums) {
            res ^= num;
        }
        return res;
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

        int result = singleNumber(nums);

        // Output result
        System.out.println("Single number is: " + result);
    }
}
