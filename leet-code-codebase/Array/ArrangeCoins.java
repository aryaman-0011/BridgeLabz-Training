import java.util.Scanner;

public class ArrangeCoins {

    // Binary search to find integer square root
    public static int sqrt(long n) {
        long low = 0, high = n;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid == n / mid) {
                return (int) mid;
            } 
            else if (mid < n / mid) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return (int) high;
    }

    public static int arrangeCoins(int n) {
        long m = (long) n;
        return (sqrt(8 * m + 1) - 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of coins: ");
        int n = sc.nextInt();

        int rows = arrangeCoins(n);

        System.out.println("Maximum complete rows: " + rows);

        sc.close();
    }
}
