/*
   4. Write a program to check for the natural number and write the sum of n natural numbers 
   Hint => 
    a. A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
    b. A sum of n natural numbers is n * (n+1) / 2 
   I/P => number
   O/P => If the number is a positive integer then the output is
   The sum of ___ natural numbers is ___
   Otherwise 
   The number ___ is not a natural number
*/

import java.util.Scanner;

public class NaturalNumber {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a natural number: ");
		int naturalNum = input.nextInt();

		// Edge case
		if(naturalNum < 0) {
			System.out.println("The number is not a natural number");
		} else {
			// Print sum of n natural numbers logic
			int naturalSum = naturalNum * (naturalNum + 1) / 2;

			// Display output
			System.out.println("The sum of " + naturalNum + " natural number is " + naturalSum);
		}

		input.close();
	}
}