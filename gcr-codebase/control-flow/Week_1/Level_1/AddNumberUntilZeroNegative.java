/* Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement */

import java.util.Scanner;

public class AddNumberUntilZeroNegative {
	public static void main(String[] args) {
		
		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num = input.nextDouble();


		double total = 0.0;
		
		while(num != 0 && num > 0) {
			total = total + num;
			System.out.println("Enter a number: ");
			num = input.nextDouble();
		

		}

		System.out.println("Total value is: " + total);

		input.close();
	}
}