/* 1. Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
      Hint => 
	a. The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same. 
	b. Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
	c. Write code having multiple if else statements based on conditions provided above and a second part having only one if statement and multiple logical 
*/

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {

		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = input.nextInt();


		// Logic for leap year
		if( year < 1582) {
			System.out.println("Leap is only valid for year >= 1582");
		} else if(year % 100 == 0){
			System.out.println("Year is not a leap year");
		} else if(year % 4 == 0) {
			System.out.println("Year is a leap year");
		} else{
			System.out.println("Year is not a leap year");
		}

		input.close();
	}
}