import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {

		// Take user input
		Scanner input = new Scanner(System.in);
		String coffeeType;

		while (true) {

			System.out.print("\nEnter coffee type (Espresso / Cappuccino / Latte) or type 'exit' to stop: ");
			coffeeType = input.nextLine();

			if (coffeeType.equalsIgnoreCase("exit")) {
				System.out.println("Cafe closed. Thank you!");
				break;
			}

			System.out.print("Enter quantity: ");
			int quantity = input.nextInt();
			input.nextLine(); // clear buffer

			double price = 0;

			// Select coffee
			switch (coffeeType.toLowerCase()) {
				case "espresso":
					price = 80;
					System.out.println("Espresso price: Rs. 80");
					break;

				case "cappuccino":
					price = 120;
					System.out.println("Espresso price: Rs. 120");
					break;

				case "latte":
					price = 150;
					System.out.println("Espresso price: Rs. 150");
					break;

				default:
					System.out.println("Invalid coffee type!");
					continue;
			}

			// Calclate bill
			double bill = price * quantity;
			double gst = bill * 0.05;
			double totalAmount = bill + gst;


			// Display output
			System.out.println("Bill Amount: Rs. " + bill);
			System.out.println("GST (5%): Rs. " + gst);
			System.out.println("Total Amount to Pay: Rs. " + totalAmount);

		}

		input.close();
	}
}
