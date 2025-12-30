/*
14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
- Use switch and if together.
- Loop through multiple customers.
- Clean structure and helpful variable names.
*/

import java.util.*;

public class MovieTicketBooking {
	
	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in);
		char choice = 'y';


		do {
			System.out.print("=================== WELCOME TO MOVIE TICKET BOOKING ====================");


			System.out.print("\nEnter movie type (Action / Comedy / Drama): ");
			String movieType = input.next();

			System.out.print("\nEnter seat type (Gold / Silver): ");
			String seatType = input.next();


			System.out.print("\nEnter snacks (Yes/No): ");
			String snacksChoice = input.next();



			int ticketPrice = 0;
			int snacksPrice = 0;


			switch (movieType.toLowerCase()) {
			
				case "action":
					ticketPrice = 200;
					break;

				case "comedy":
					ticketPrice = 50;
					break;
	
				case "drama":
					ticketPrice = 100;
					break;

				default:
					System.out.println("Invalid movie type!");
					continue;
			}



			if (seatType.equalsIgnoreCase("gold")) {
				ticketPrice += 200;
			} else if (seatType.equalsIgnoreCase("silver")) {
				ticketPrice += 100;
			} else {
				System.out.println("Invalid seat type");
				continue;
			}


			if (snacksChoice.equalsIgnoreCase("yes")) {
				snacksPrice = 300;
			}


			int totalAmount = ticketPrice + snacksPrice;
			
			System.out.println("=========== BOOKING SUMMARY ============");
			System.out.println("Movie Type: " + "\t" + movieType);
			System.out.println("Seat Type: " + "\t" + seatType);
			System.out.println("Snacks: " + "\t" + snacksChoice);
			System.out.println("Total Bill: " + "\t" + totalAmount);


			System.out.print("\nBook ticket for next customer? (y/n): ");
			choice = input.next().charAt(0);


		} while (choice == 'y' || choice == 'Y');


		input.close();

	}
}



	
