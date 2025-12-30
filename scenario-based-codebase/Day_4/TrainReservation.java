/*
12. Train Reservation Queue
Simulate a basic ticket booking system.
- Show menu with switch
- Allow multiple bookings using while-loop.
- Stop booking once seats reach zero (break).
*/

import java.util.*;

public class TrainReservation {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);

		// Initializing seats
		boolean[] seats = new boolean[10];
		int booked = 0;

		while (true) {
			// Check is all seats are booked
			if (booked == seats.length) {
				System.out.print("\nAll seats are booked!");
			}
		

			// Display counter
			System.out.println("\n============== RESERVATION COUNTER ===============");
			System.out.print("\nPress B for Ticket Booking");
			System.out.print("\nPress C for Ticket Cancellation");
			System.out.print("\nPress S to display ChartSheet");
			System.out.println("\nPress E to Exit System");


			char choice = input.next().charAt(0);


			switch (choice) {

				// Case for booking ticket
				case 'b':
				case 'B':
					boolean isBooked = false;
					for (int i = 0; i < seats.length; i++) {
						if (!seats[i]) {
							seats[i] = true;
							booked++;
							System.out.print("\nSeat Number " + (i + 1) + " booked successfully!");
							isBooked = true;
							break;
						}
					}

					if(!isBooked) {
						System.out.print("\nNo seats available!");
					}
					break;

				// Case for ticket cancellation
				case 'c':
				case 'C':
					boolean isCancelled = false;
					for (int i = 0; i  < seats.length; i++) {
						if (seats[i]) {
							seats[i] = false;
							booked--;
							System.out.print("\nYour seat number " + (i + 1) + " is cancelleled Successfully");
							isCancelled = true;
							break;
						}
					}

					if (!isCancelled) {
						System.out.println("\nNo booked seats to cancel!");
					}
					break;

				// Case for displaying chartsheet
				case 's':
				case 'S':
					System.out.print("\nSeats \t Status");
					for(int i = 0; i < seats.length; i++) {
						System.out.print("\n" + (i + 1) + "\t" + (!seats[i] ? "Empty" : "Booked"));
					}
					break;


				// Case to exit system
				case 'e':
				case 'E':
					System.out.println("Exiting system. Thank you!");
					return;

		
				default:
					System.out.print("\nInvalid Input!");
			}
		}

	}
}

		