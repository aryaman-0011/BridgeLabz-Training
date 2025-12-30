/*
15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
- Input return date and due date.
- If returned late, calculate fine: ₹5/day.
- Repeat for 5 books using for-loop.
*/

import java.util.*;

public class LibraryReminder {

	public static void main (String [] args) {
	
		Scanner input = new Scanner(System.in);

		int finePerDay = 5;
		int totalFine = 0;


		for (int i = 1; i <= 5; i++) {
			System.out.println("\nBook " + i);
		
			// Input due date
			System.out.print("\nEnter due date: ");
			int dueDate = input.nextInt();

			// Input return date
			System.out.print("\nEnter return date: ");
			int returnDate = input.nextInt();


			if (returnDate > dueDate) {
				int lateDays = returnDate - dueDate;
				int fine = lateDays * finePerDay;
				totalFine += fine;
			
				System.out.println("Late by " + lateDays + " days");
				System.out.println("Fine: " + fine + "Rs");
			} else {
				System.out.println("Returned on time. No fine!");
			}

		}

		// Display total fine
		System.out.println("\nTotal Fine for all books: " + totalFine + "Rs");
		input.close();
	}
}