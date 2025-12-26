import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Conversion calculations
        double distanceInYards = distanceInFeet / 3; 
        double distanceInMiles = distanceInYards / 1760; 

        // Output
        System.out.println(
            "The distance of " + distanceInFeet + " feet is " 
            + distanceInYards + " yards and " 
            + distanceInMiles + " miles."
        );

        sc.close();
    }
}
