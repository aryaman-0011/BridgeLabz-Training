import java.util.Scanner;

public class BmiTwoD {
    	public static void main(String[] args) {

        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter number of persons: ");
        	int n = input.nextInt();

        	double[][] personData = new double[n][3];
        	String[] status = new String[n];

        	// Take input from user
        	for (int i = 0; i < n; i++) {
            		System.out.println("\nPerson " + (i + 1));

            		System.out.print("Weight: ");
            		personData[i][0] = input.nextDouble();

            		System.out.print("Height: ");
            		personData[i][1] = input.nextDouble();
        	}


        	// Calculate BMI and status
        	for (int i = 0; i < n; i++) {

            		personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            		if (personData[i][2] <= 18.4)
                		status[i] = "Underweight";

            		else if (personData[i][2] <= 24.9)
                		status[i] = "Normal";

            		else if (personData[i][2] <= 39.9)
                		status[i] = "Overweight";

            		else
                		status[i] = "Obese";
        	}


        	// Display result
        	for (int i = 0; i < n; i++) {
            		System.out.println("Person " + (i + 1) +
                    	" | Weight: " + personData[i][0] +
                   	" | Height: " + personData[i][1] +
                    	" | BMI: " + String.format("%.2f", personData[i][2]) +
                    	" | Status: " + status[i]);
        	}

        	input.close();
    	}
}
