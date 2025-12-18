/* 14. Rewrite the above program to find the power of a number using a while loop.
       Hint => 
	a. Get integer input for two variables named number and power.
	b. Create a result variable with an initial value of 1.
	c. Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
	d. In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
	e. Finally, print the result
*/


import java.util.Scanner;

public class PowerOfNumberWhile {
	public static void main(String[] args) {

		// Take input from user
		Scanner input = new Scanner(System.in);
        	System.out.print("Enter a number: ");
		int number = input.nextInt();
        	System.out.print("Enter power: ");
		int power = input.nextInt();
		
		// Logic to find result
		int result = 1;
		int counter = 0;
		while(counter < power){
			result = result * number;
			counter++;
		}

		// Display result
		System.out.println(number + " raised to the power " + power + " is: " + result);
		
		input.close();
			
	}
}