/*
  Write a program to check whether a number is positive, negative, or zero.
  Hint => 
    a. Get integer input from the user and store it in the number variable.
    b. If the number is positive, print positive.
    c. If the number is negative, print negative.
    d. If the number is zero, print zero. 
*/

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		
		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();

		if(number > 0) {
			System.out.println("positive");
		} else if(number < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
		
		input.close();
	}
}