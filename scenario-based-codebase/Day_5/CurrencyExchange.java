/*
18. Currency Exchange Kiosk
Design a currency converter:
- Take INR amount and target currency.
- Use a switch to apply the correct rate.
- Ask if the user wants another conversion (do-while).
*/

import java.util.*;

public class CurrencyExchange {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);
		String choice;

		do {

			// Taking user input
			System.out.print("Enter amount (in INR): ");
			double inr = input.nextDouble();
			System.out.print("\nEnter target currency (Dollar / Euro / Pound): "); // 89, 105, 120
			String currency = input.next().toLowerCase();

			double dollar = 0, euro = 0, pound = 0;
			
			// Calculate currency
			switch (currency) {
				
				case "dollar":
					dollar = 89 / inr;
					System.out.print("INR -> US Dollar: " + dollar);
					break;

				case "euro":
					euro = 105 / inr;
					System.out.print("INR -> Euro: " + euro);
					break;

				case "pound":
					pound = 120 / inr;
					System.out.print("INR -> Pound: " + pound);
					break;

				default:
					System.out.println("Invalid currency!");

			}

			System.out.print("\nDo you want to convert in another currency? (yes/no): ");
			choice = input.next().toLowerCase();

		} while (choice.equals("yes"));

		input.close();
	}
}

		