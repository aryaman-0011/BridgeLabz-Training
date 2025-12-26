/* 7. Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
      Hint => 
	a. Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
	b. Create an integer array for even and odd numbers with size = number / 2 + 1
	c. Create index variables for odd and even numbers and initialize them to zero
	d. Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
	e. Finally, print the odd and even numbers array using the odd and even index
*/

import java.util.Scanner;

public class EvenOddArray {
	public static void main(String[] args) {
		
		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();

		int[] even = new int[num / 2 + 1];
		int[] odd = new int[num / 2 + 1];
		

		// Check natural number
		if(num <= 0) {
			System.err.println(num + " is not a natural number!");
			System.exit(0);
		}

		// Store numbers in even and odd array
		int evenIndex = 0;
		int oddIndex = 0;
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				even[evenIndex] = i;
				evenIndex++;
			} else {
				odd[oddIndex] = i;
				oddIndex++;
			}
		}


		// Display output
		System.out.print("Even Numbers:");
		for(int i = 0; i < evenIndex; i++) {
			System.out.print(even[i] + " ");
		}

		System.out.print("\nOdd Numbers:");
		for(int i = 0; i < oddIndex; i++) {
			System.out.print(odd[i] + " ");
		}

		input.close();
	}
}