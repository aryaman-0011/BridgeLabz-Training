/*
9. School Bus Attendance System
Track 10 students' presence.
- Use for-each loop on names.
- Ask "Present or Absent?"
- Print total present and absent counts.
*/

import java.util.*;

public class BusAttendance {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// Array for student name and attendance
		boolean[] attendance = new boolean[10];
		String[] names = new String[10];

		// Enter student names
		System.out.println("Enter names of student");
		for(int i = 0; i < 10; i++) {
			System.out.print("\nEnter name of " + (i + 1) + " student: ");
			names[i] = input.nextLine();
		}


		int index = 0;
		int present = 0;
		int absent = 0;

		// Condition for absent and present
		for (String name : names) {
			System.out.print("Is" + name + "Present or Absent? (P/A): ");
			char choice = input.next().charAt(0);

			if (choice == 'p' || choice == 'P') {
				attendance[index] = true;
				present++;
			} else {
				attendance[index] = false;
				absent++;
			}
			index++;
		}
		input.nextLine();


		// Display attendance sheet
		System.out.println("================== ATTENDANCE SHEET ================");
		System.out.print("\n\tName \t\t Attendance");
		for (int i = 0; i < 10; i++) {
			System.out.print("\n\t" + names[i] + "\t\t\t" + (!attendance[i] ? "A" : "F"));
		}

		// Display attendance status
		System.out.print("\n================== ATTENDANCE STATUS ================");
		System.out.print("\n\tTotal Present: " + present);
		System.out.print("\n\tTotal Absent: " + absent);

		input.close();

	}
}	