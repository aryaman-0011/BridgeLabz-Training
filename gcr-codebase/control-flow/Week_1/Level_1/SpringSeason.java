/*
  7. Write a program SpringSeason that takes two int values month and day from the command line and prints "Its a Spring Season" otherwise        
     prints "Not a Spring Season". 
     Hint => 
     a. Spring Season is from March 20 to June 20
*/

import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {
		
		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month: ");
		int month = input.nextInt();
		System.out.println("Enter day: ");
		int day = input.nextInt();


		// Logic to find spring season
		if(month == 3 && day >= 20 || month == 4 || month == 5 || month == 6 && day <=20) {
			System.out.println("Its a Spring Season");
		} else {
			System.out.println("Not a Spring Season");
		}

		input.close();
	}
}