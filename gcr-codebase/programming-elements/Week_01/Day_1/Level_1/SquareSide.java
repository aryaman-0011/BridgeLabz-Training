import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input perimeter from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Calculate side
        double side = perimeter / 4;

        // Output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        sc.close();
    }
}
