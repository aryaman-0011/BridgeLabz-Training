/* 1. Create a program to print odd and even numbers between 1 to the number entered by the user.
       Hint => 
	a. Get an integer input from the user, assign to a variable number and check for Natural Number
	b. Using a for loop, iterate from 1 to the number
	c. In each iteration of the loop, print the number is odd or even number
*/

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();


		// Check natural number
		if(number >= 0) {
			for(int i = 1; i <= number; i++) {
				if(i % 2 == 0) {
					System.out.println(i + " is Even");
				} else{
					System.out.println(i + " is odd");
				}
			}

			System.out.println(number + " is a natural number!");
		
		} else{
			System.out.println(number + " is not a natural number!");
		}


		input.close();

	}
}
