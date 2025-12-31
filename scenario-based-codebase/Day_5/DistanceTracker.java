/*
19. Bus Route Distance Tracker
Each stop adds distance.
- Ask if the passenger wants to get off at a stop.
- Use a while-loop with a total distance tracker.
- Exit on user confirmation.
*/

import java.util.*;

public class DistanceTracker {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		double totalDistance = 0;
		String choice = "no";


		// Calculate distance at eyery stop
		while (!choice.equals("yes")) {
			
			// Take distance from user
			System.out.print("Enter distance covered at this stop (in km): ");
			double distance = input.nextDouble();

			totalDistance += distance;

			System.out.println("Total distance trvelled " + totalDistance + " km");
			System.out.print("\nDo you want to get off at this stop? (yes/no): ");
			choice = input.next().toLowerCase();

		}

		// Display total distance
		System.out.println("Passenger exited the bus!");
		System.out.println("Total distance travelled " + totalDistance + " km");

		input.close();

	}
}
	