/* 3. Create a program to print a multiplication table of a number.
      Hint => 
	a. Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 1
	b. Run a loop from 1 to 10 and store the results in the multiplication table array
	c. Finally, display the result from the array in the format number * i = ___
*/

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		
		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();


		//Store table in array
		int[] table = new int[10];
		for(int i = 1; i <= 10; i++) {
			table[i - 1] = num * i;
		}

		
		// Display table
		for(int i = 1; i <= 10; i++) {
			System.out.println(num+ " * " + i + " = " + table[i - 1]);
		}

		input.close();
	}
}