import java.util.*;

public class LeapYear {
	
	public static boolean checkLeapYear(int year) {

		// Georgioan year check
		if (year < 1582) {
			return false;
		}

		// Leap year check
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		
		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = input.nextInt();


		// Display output
		if(checkLeapYear(year)) {
			System.out.print(year + " is a leap year!");
		} else {
			System.out.print(year + " is not a leap year!");
		}

		input.close();
	}
}