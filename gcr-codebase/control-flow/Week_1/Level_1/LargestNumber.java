/*
3. Write a program to check if the first, second, or third number is the largest of the three.
   I/P => number1, number2, number3
   O/P => 
   Is the first number the largest? ____
   Is the second number the largest? ___
   Is the third number the largest? ___
*/

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {

		// Taking input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1 = input.nextInt();
		System.out.println("Enter second number: ");
		double num2 = input.nextInt();
		System.out.println("Enter third number: ");
		double num3 = input.nextInt();

		// Logic to find largest number
		if(num1 > num2 && num1 > num3) {
			System.out.println("First number - " + num1 + " is the largest among three");
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println("Second number - " + num2 + " is the largest among three");
		}
		else{
			System.out.println("Third number - " + num3 + " is the largest among three");
		}

		input.close();
	}
}
