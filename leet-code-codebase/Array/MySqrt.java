import java.util.Scanner;

public class MySqrt {

    public static int mySqrt(int x) {
        double y = Math.sqrt(x);
        int value = (int) y;     
        return value;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        int result = mySqrt(x);
        System.out.println("Integer square root: " + result);

        sc.close();
    }
}
