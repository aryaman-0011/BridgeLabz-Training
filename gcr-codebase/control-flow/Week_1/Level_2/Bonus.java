/* 2. Create a program to find the bonus of employees based on their years of service.
       Hint => 
	a. Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
	b. Take salary and year of service in the year as input.
	c. Print the bonus amount.
*/

import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		
		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter salary: ");
		int salary = input.nextInt();
		System.out.println("Enter years: ");
		int year = input.nextInt();


		// Logic for calculating bonus
		int bonus = 0;
		if(year > 5) {
			bonus = (salary * 5) / 100;
			System.out.println("Bonus for " + salary + " is " + bonus);

		} else{
			System.out.println("Employee not eligible for bonus!");
		}

	input.close();

	}
}

		