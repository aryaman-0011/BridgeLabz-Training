/* 12. Create a program to find the power of a number.
       Hint => 
	a. Get integer input for two variables - number and power and check for positive integer
	b. Create a result variable with an initial value of 1.
	c. Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result
*/

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {

		// Take input from user
		Scanner input = new Scanner(System.in);
        	System.out.print("Enter a number: ");
		int number = input.nextInt();
        	System.out.print("Enter power: ");
		int power = input.nextInt();
		
		// Logic to find result
		int result = 1;
		for(int i = 1; i <= power; i++){
			result = result * number;
		}

		// Display result
		System.out.println(number + " raised to the power " + power + " is: " + result);
		
		input.close();
			
	}
}