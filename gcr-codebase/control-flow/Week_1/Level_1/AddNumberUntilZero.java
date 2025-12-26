/*
  Write a program to find the sum of numbers until the user enters 0
  Hint => 
   a. Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
   b. Use the while loop to check if the user entered is 0
   c. If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
   d. The loop will continue till the user enters zero and outside the loop display the total value
*/

import java.util.Scanner;

public class AddNumberUntilZero {
	public static void main(String[] args) {
		
		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num = input.nextDouble();


		double total = 0.0;
		
		while(num != 0) {
			total = total + num;
			System.out.println("Enter a number: ");
			num = input.nextDouble();
		

		}

		System.out.println("Total value is: " + total);

		input.close();
	}
}