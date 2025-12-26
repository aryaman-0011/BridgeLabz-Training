import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height in cm
        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = scanner.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = scanner.nextDouble();

        // Calculate area in square centimeters
        double areaSqCm = 0.5 * baseCm * heightCm;

        // Convert cm to inches and calculate area in square inches
        double baseIn = baseCm / 2.54;
        double heightIn = heightCm / 2.54;
        double areaSqIn = 0.5 * baseIn * heightIn;

        // Display results
        System.out.println("The Area of the triangle in sq in is " + areaSqIn 
                           + " and in sq cm is " + areaSqCm);

        scanner.close();
    }
}
