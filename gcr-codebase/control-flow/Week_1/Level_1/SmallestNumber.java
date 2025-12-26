/*
2. Write a program to check if the first is the smallest of the 3 numbers.
   I/P => number1, number2, number3
   O/P => Is the first number the smallest? ____
*/

import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		
		// Taking input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1 = input.nextInt();
		System.out.println("Enter second number: ");
		double num2 = input.nextInt();
		System.out.println("Enter third number: ");
		double num3 = input.nextInt();

		// Logic to find smallest number
		if(num1 < num2 && num1 < num3) {
			System.out.println(num1 + " is the smallest among three");
		}
		else if(num2 < num1 && num2 < num3) {
			System.out.println(num2 + " is the smallest among three");
		}
		else{
			System.out.println(num3 + " is the smallest among three");
		}

		input.close();
	}
}