import java.util.Scanner;

public class BMICalculator {

    	// Method to calculate BMI and store it in 3rd column
    	public static void calculateBMI(double[][] data) {
        	for (int i = 0; i < data.length; i++) {
            		double weight = data[i][0];      
            		double heightCm = data[i][1];

            		double heightMeter = heightCm / 100; 
            		double bmi = weight / (heightMeter * heightMeter);

            		data[i][2] = bmi;
        	}
    	}

    	// Method to determine BMI status
    	public static String[] getBMIStatus(double[][] data) {
        	String[] status = new String[data.length];

        	for (int i = 0; i < data.length; i++) {
            		double bmi = data[i][2];

            		if (bmi <= 18.4) {
                		status[i] = "Underweight";
            		} else if (bmi >= 18.5 && bmi <= 24.9) {
                		status[i] = "Normal";
            		} else if (bmi >= 25.0 && bmi <= 39.9) {
                		status[i] = "Overweight";
            		} else {
                		status[i] = "Obese";
            		}
        	}
        	return status;
    	}

    
    	public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);

        	double[][] persons = new double[10][3];

        	// Input weight and height
        	for (int i = 0; i < 10; i++) {
            		System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            		persons[i][0] = input.nextDouble();

            		System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            		persons[i][1] = input.nextDouble();
        	}

        	calculateBMI(persons);

        	// Get BMI status
        	String[] status = getBMIStatus(persons);

        	// Display results
        	System.out.println("\nPerson\tWeight\tHeight\tBMI\t\tStatus");
        	for (int i = 0; i < 10; i++) {
            		System.out.printf("%d\t%.1f\t%.1f\t%.2f\t%s\n",
                    	(i + 1),
                    	persons[i][0],
                    	persons[i][1],
                    	persons[i][2],
                    	status[i]);
        	}

        	input.close();
    	}
}
