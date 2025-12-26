import java.util.Scanner;

public class BMICalculator {
    	public static void main(String[] args) {

        	Scanner sc = new Scanner(System.in);

        	// Take number of persons
        	System.out.print("Enter number of persons: ");
        	int n = sc.nextInt();

        	// Arrays to store data
        	double[] weight = new double[n];
        	double[] height = new double[n];
        	double[] bmi = new double[n];
        	String[] status = new String[n];

        	// Input height and weight
        	for (int i = 0; i < n; i++) {
            		System.out.println("\nEnter details for Person " + (i + 1));

            		System.out.print("Enter weight (kg): ");
            		weight[i] = sc.nextDouble();

            		System.out.print("Enter height (m): ");
            		height[i] = sc.nextDouble();
        	}

        	// Calculate BMI and status
        	for (int i = 0; i < n; i++) {

            		bmi[i] = weight[i] / (height[i] * height[i]);

            		if (bmi[i] <= 18.4) {
                		status[i] = "Underweight";
            		} else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                		status[i] = "Normal";
            		} else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                		status[i] = "Overweight";
            		} else {
                		status[i] = "Obese";
            		}
        	}

        	// Display results
        	for (int i = 0; i < n; i++) {
            		System.out.println("Person " + (i + 1));
            		System.out.println("Height: " + height[i] + " m");
            		System.out.println("Weight: " + weight[i] + " kg");
            		System.out.println("BMI: " + bmi[i]);
            		System.out.println("Status: " + status[i]);
        	}

        	sc.close();
    	}
}
