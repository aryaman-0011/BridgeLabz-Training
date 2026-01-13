import java.util.*;
import java.util.stream.*;

public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {

        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        int distinctCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                distinctCount++;
            }
            if (distinctCount == 3) {
                return arr[i];
            }
        }

        // If third distinct max does not exist
        return arr[0];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = thirdMax(nums);

        System.out.println("Third maximum number: " + result);

        sc.close();
    }
}
