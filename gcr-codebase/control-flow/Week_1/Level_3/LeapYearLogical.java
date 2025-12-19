/* 2. Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators */

import java.util.Scanner;

public class LeapYearLogical {
	public static void main(String[] args) {

		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = input.nextInt();


		// Logic for leap year
		if(year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
			System.out.println("year is a leap year");
		} else if(year < 1582) {
			System.out.println("Leap is only valid for year >= 1582");
		} else {
			System.out.println("year is not a leap year");
		}

		input.close();
	}
}