/*
20. Festival Lucky Draw
At Diwali mela, each visitor draws a number.
- If the number is divisible by 3 and 5, they win a gift.
- Use if, modulus, and loop for multiple visitors.
- continue if input is invalid.
*/

import java.util.*;

public class LuckyDraw {

	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in);
		String choice = "no";

		// Logic for lucky draw
		while (!choice.equals("yes")) {
			
			// Take coupon number input from user
			System.out.print("Enter your coupon number: ");
			int luckyNum = input.nextInt();

			if (luckyNum <= 0) {
				System.out.println("Invalid number! Skipping...");
				continue;
			}

			if (luckyNum % 3 == 0 && luckyNum % 5 == 0) {
				System.out.print("\nYou won a gift!!");
			} else {
				System.out.print("\nSorry! better luck next time...");
			}

			// Exit lucky draw condition
			System.out.print("\nExit lucky draw? (yes/no): ");
			choice = input.next();

		}
	}
}