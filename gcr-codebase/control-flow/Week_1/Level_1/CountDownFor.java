/* Rewrite program 8 to do the countdown using the for-loop */

import java.util.Scanner;

public class CountDownFor {
	public static void main(String[] args) {
		
		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number for countdown: ");
		int counter = input.nextInt();

		// Logic for countdown using for loop
		for(int i = counter; i >= 1; i--) {
			System.out.println(counter);
			counter--;
		}
		
		input.close();

	}
}