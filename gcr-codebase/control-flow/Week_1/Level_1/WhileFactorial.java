/* 14. Write a Program to find the factorial of an integer entered by the user.
       Hint => 
	a. For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
	b. Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
	c. Using a while loop, compute the factorial.
	d. Print the factorial at the end.
*/


import java.util.Scanner;

public class WhileFactorial {
	public static void main(String[] args) {
		
		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find factorial: ");
		int num = input.nextInt();
		

		// Saving a copy of num in originalNum
		int originalNum = num;

		// Logic to find factorial
		int fact = 1;
		while(num != 0) {
			fact = fact * num;
			num--;
		}
		
		// Display output
		System.out.println("Factorial of " + originalNum + " is: " + fact);

		input.close();

	}
}	
	
		