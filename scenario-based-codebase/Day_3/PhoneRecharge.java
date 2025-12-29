/*
10. Phone Recharge Simulator
Take the user's mobile operator and amount.
- Use a switch to display offers.
- Loop to allow repeated recharges.
- Show balance after each recharge.
*/

import java.util.*;

public class PhoneRecharge {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);

		double balance = 0;
		char choice;


		do {
			// Taking user input
			System.out.print("\nEnter mobile operator (jio / airtel / VI): ");
			String operator = input.next().toLowerCase();
			System.out.print("Enter recharge amount: ");
			double amount = input.nextDouble();

			balance += amount;

			// Seleect operator
			switch (operator) {
				
				case "jio":
					System.out.println("Offer: 1.5GB/day + Unlimited Calls");
					break;

				case "airtel":
					System.out.println("Offer: 2/day + Unlimited Calls");
					break;

				case "vi":
					System.out.println("Offer: 1.5GB/day + Unlimited Calls");
					break;

				default:
					System.out.println("Invalid operator!");
			}


			System.out.println("Do you want to recharge again? (Y/N): ");
			choice = input.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');

		// Display output
		System.out.println("Current Balance: " + balance + "Rs");
		System.out.println("\nThanks for using our app!!");

	}
}