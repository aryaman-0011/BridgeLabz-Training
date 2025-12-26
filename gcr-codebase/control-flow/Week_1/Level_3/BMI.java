/* 7. Create a program to find the BMI of a person
      Hint => 
	a. Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
	b. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
	c. Use the table to determine the weight status of the person
*/


import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {

		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight (in kg): ");
		double weight = input.nextDouble();
		System.out.println("Enter your height (in cm): ");
		double height = input.nextDouble();

		
		// Convert height from cm to m
		double heigthInMeter = height/ 100;
		// Calculate BMI
		double bmi = weight / (heigthInMeter * heigthInMeter);

		// Conditions to display output according to BMI
		if(bmi <= 18.4) {
			System.out.println("Underweigth");
		} else if(bmi >= 18.5 && bmi < 25.0) {
			System.out.println("Normal");
		} else if(bmi >= 25.0 && bmi < 30.0) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}

		input.close();

	}
}