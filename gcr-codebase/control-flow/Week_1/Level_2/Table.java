/* 3. Create a program to find the multiplication table of a number entered by the user from 6 to 9.
       Hint => 
	a. Take integer input and store it in the variable number
	b. Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___ 
*/

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		
		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();


		// Logic for printing table
		for(int i = 6; i <= 9; i++) {
			System.out.println(number + " * " + i + " = " + number*i);
		}

		input.close();

	}
}