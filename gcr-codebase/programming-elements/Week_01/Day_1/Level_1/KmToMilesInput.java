import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {

        // variable to store kilometers
        double km;

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Read kilometers from user
	System.out.println("Enter distance in Km:");
        km = input.nextInt();

        // Given: 1 mile = 1.6 km
        double miles = km / 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }
}
