/* 1. Write a program to check if a number is divisible by 5
      I/P => number
      O/P => Is the number ___ divisible by 5? ___
*/


import java.util.Scanner;

public class DivisibleByFive {
	public static void main(String[] args) {
		
		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();

		// Check divisibility
		if(num % 5 == 0) {
			System.out.println("Number is divisible by 5!");
		}
		else {
			System.out.println("Number is not divisible by 5!");
		}

		input.close();
	}
}