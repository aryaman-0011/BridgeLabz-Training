import java.util.Scanner;

public class BMIFitnessTracker {

	public static void main (String[] args) {
	
		// Take input user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight (in kg): ");
		double weight = input.nextDouble();
		System.out.print("Enter height (in m): ");
		double height = input.nextDouble();

		
		// Formula to calculate BMI
		double bmi = weight / (height * height);

		
		// Display BMI status
		System.out.println("your BMI is: " + bmi);
	
		if(bmi < 18.5) {
			System.out.println("BMI status: Underweight");
		} else if (bmi >= 18.5 && bmi < 25.0) {
			System.out.println("BMI status: Normal");
		} else if (bmi >= 25.0 && bmi <= 39.9){
			System.out.println("BMI status: Overweight");
		} else {
			System.out.println("BMI status: Obese");
		}


		input.close();
	}
}

