/* 5. Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
      Hint => 
	a. Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
	b. Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
	c. Finally, display the result from the array in the format number * i = ___
*/


import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		
		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();

		
		// Store result in array
		int[] multiplicationResult =  new int[4];
		int index = 0;
		for(int i = 6; i <= 9; i++) {
			multiplicationResult[index] = num * i;
			index++;
		}

		
		// Display result
		index = 0;
		for(int i = 6; i <= 9; i++) {
			System.out.println(num+ " * " + i + " = " + multiplicationResult[index]);
			index++;
		}

		input.close();
	}
}
