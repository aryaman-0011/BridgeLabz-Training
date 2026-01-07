import java.util.Scanner;

public class SearchRange {

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // This function returns index of target
    static int search(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } 
            else if (target > nums[mid]) {
                start = mid + 1;
            } 
            else {
                // potential answer found
                ans = mid;

                if (findStartIndex) {
                    end = mid - 1;   // search left
                } else {
                    start = mid + 1; // search right
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int[] result = searchRange(nums, target);

        System.out.println("First position: " + result[0]);
        System.out.println("Last position: " + result[1]);

        sc.close();
    }
}
