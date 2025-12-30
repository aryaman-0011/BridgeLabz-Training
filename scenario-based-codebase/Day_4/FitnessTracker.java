/*
13. Sandeep’s Fitness Challenge Tracker
- Each day Sandeep completes a number of push-ups.
- Store counts for a week.
- Use for-each to calculate total and average.
- Use continue to skip rest days.
*/

import java.util.*;

public class FitnessTracker {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);

		// Take push-ups input from user
		int[] push = new int[7];
		for (int i = 0; i < push.length; i++) {
			System.out.print("Enter Day " + (i + 1) + " PushUps: ");
			push[i] = input.nextInt();
		}

		
		int total = 0;
		int activeDays = 0;
	
		// Calculate total
		for(int calc : push) {
			if (calc == 0) {
				continue;
			}
			total += calc;
			activeDays++;
		}
	
		// Calculate average
		int average = (activeDays > 0) ? total / activeDays : 0;

		// Display output
		System.out.print("\n=================== Push-Ups stats ==================");
		System.out.print("\nTotal push-ups of a week: " + total);
		System.out.print("\nActive days in a week: " + activeDays);
		System.out.print("\nAverage push-ups of a week: " + average);

		input.close();
	}
}