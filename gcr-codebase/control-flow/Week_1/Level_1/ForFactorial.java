/* 15. Rewrite program 14 using for loop
       Hint => 
	a. Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 
*/


import java.util.Scanner;

public class ForFactorial {
	public static void main(String[] args) {
		
		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find factorial: ");
		int num = input.nextInt();
		

		// Saving a copy of num in originalNum
		int originalNum = num;

		// Logic to find factorial
		int fact = 1;
		for(int i = num; i >= 1; i--){
			fact = fact * num;
		}
		

		// Display output
		System.out.println("Factorial of " + originalNum + " is: " + fact);

		input.close();

	}
}	
	
		