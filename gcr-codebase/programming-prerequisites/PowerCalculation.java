import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base: ");
        double base = sc.nextDouble();

        System.out.println("Enter power :");
        double power = sc.nextDouble();

        double result = Math.pow(base, power);

        System.out.println(result);
    }
}
