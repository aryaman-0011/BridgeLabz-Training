import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        // Area calculation
        double areaInSquareInches = 0.5 * base * height;
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;

        // Output
        System.out.println("Area of the triangle in square inches is: " + areaInSquareInches);
        System.out.println("Area of the triangle in square centimeters is: " + areaInSquareCentimeters);

        sc.close();
    }
}
