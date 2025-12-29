/*
8. Shopkeeper’s Discount Dashboard 
A shopkeeper gives discounts based on total bill:
- Input item prices in a for-loop.
- Use if-else for discount logic.
- Use proper indentation, constants, and comments.
*/

import java.util.*;

public class DiscountDashboard {

	public static void main (String[] args) {

		// Take user input for number of items
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of items: ");
		int numOfItem = input.nextInt();

		input.nextLine(); // Clear buffer

		// Array to store item and price
		String[] item = new String[numOfItem];
		int[] itemPrice = new int[numOfItem];
		

		// Take item name input
		System.out.println("\nEnter item names");
		for (int i = 0; i < numOfItem; i++) {
			System.out.print("Enter name of " + (i + 1) + " item: ");
			item[i] = input.nextLine();
		}

		System.out.print("\n==============================");

		
		// Take price input
		System.out.println("\nEnter price of items");
		for (int i = 0; i < numOfItem; i++) {
			System.out.print("Enter price of " + item[i] + ": ");
			itemPrice[i] = input.nextInt();
		}


		double discount_10 = 0.10;
		double discount_20 = 0.20;
		int totalBill = 0;
		for (int price : itemPrice) {
			totalBill += price; // Total bill
		}


		double discount = 0;

		// Condition to apply discount
		if (totalBill > 1000) {
			discount = totalBill * discount_20;
		} else if (totalBill > 500) {
			discount = totalBill * discount_10;
		}


		double finalAmount = totalBill - discount;


		// Display Oredred items and Bill
		System.out.println("=============ORDERED ITEM=============");
		System.out.println("\tItem\t\tPrice");

		for(int i = 0; i < numOfItem; i++) {
			System.out.println("\t" + item[i] + "\t\t" + itemPrice[i] + "Rs");
		}
		

		System.out.println("===============BILL SUMMARY============");
		System.out.println("\tTotal Bill: \t\t" + totalBill +"Rs");
		System.out.println("\tDiscount: \t\t" + discount +"Rs");
		System.out.println("\tPayable Amount: \t" + finalAmount +"Rs");


	}
}
			
		