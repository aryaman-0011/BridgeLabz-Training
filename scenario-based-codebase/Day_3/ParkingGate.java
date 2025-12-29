/*
6. Parking Lot Gate System 🚗
Develop a smart parking system.
- Options: Park, Exit, Show Occupancy
- Use switch-case for the menu.
- while loop to continue until the parking lot is full or the user exits.
*/

import java.util.Scanner;

public class ParkingGate {
	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in);

		// Array for parking slots
		boolean[] parkingLot = new boolean[10];
		int occupied = 0;
		
		while (true) {
			if (occupied == parkingLot.length) {
				System.out.print("\nParking Lot is Full!!");
			}
			

			// Take user input
			System.out.print("\nEnter (Park / Exit/ Show Occupancy or enter invalid command to exit system): ");
			String choice = input.nextLine().toLowerCase();

			
			switch (choice.toLowerCase()) {
				
				case "park":
					boolean parked = false;
					for (int i = 0; i < parkingLot.length; i++) {
						if (!parkingLot[i]) {
							parkingLot[i] = true;
							occupied++;
							System.out.print("\nCar parked at " + (i + 1));
							parked = true;
							break;
							
						}
					}

					if (!parked) {
						System.out.println("Car not parked! All slots are full!");
					}
					break;


		
				case "exit":
					boolean exited = false;
					for (int i = 0; i < parkingLot.length; i++) {
						if (parkingLot[i]) {
							parkingLot[i] = false;
							occupied--;
							System.out.print("\nCar exited from " + (i + 1));
							exited = true;
							break;
						}
					}

					if (!exited) {
						System.out.println("Parking is empty");
					}
					break;
	
				case "show":
					for(int i = 0; i < parkingLot.length; i++) {
						System.out.println("Slot " + (i + 1) + ": " + (parkingLot[i] ? "Occupied" : "Empty"));
					}
					break;

				default:
					System.out.println("Invalid Input!!");
					System.exit(0);
			}
		}
		
	}
}
		
				
					
				
				