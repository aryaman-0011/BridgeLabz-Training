/* 2. Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally     
      compare the first and last elements of the array and display if they equal, greater or less
      Hint => 
	a. Define an integer array of 5 elements and get user input to store in the array.
	b. Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
	c. If the number is negative, print negative. Else if the number is zero, print zero. 
	d. Finally compare the first and last element of the array and display if they equal, greater or less
*/

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		
		// Take user input
		Scanner input = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("Enter 5 numbers:");
		for(int i = 0; i < num.length; i++){
			num[i] = input.nextInt();
		}


		// Logic...
		for(int i = 0; i < num.length; i++) {
			if(num[i] > 0) {
				if(num[i] % 2 == 0) {
					System.out.println(num[i] + " is even!");
				} else {
					System.out.println(num[i] + " is odd!");
				}
			} else if(num[i] < 0) {
				System.out.println(num[i] + " is Negative!");
			} else {
				System.out.println(num[i] + " is zero!");
			}
		}

		// Check between first and last element
		if(num[0] == num[num.length - 1]) {
			System.out.println("Equal!");
		} else if(num[0] > num[num.length - 1]){
			System.out.println("First element is greater!");
		} else {
			System.out.println("First element is less!");
		}



		input.close();
	}
}
