/*
  Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
  Hint => 
   a. Create a variable counter to take user inputted value for the countdown.
   b. Use the while loop to check if the counter is 1
   c. Inside a while loop, print the value of the counter and decrement the counter.
*/


import java.util.Scanner;

public class CountDownWhile {
	public static void main(String[] args) {
		
		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number for countdown: ");
		int counter = input.nextInt();

		// Logic for countdown
		while(counter >= 1) {
			System.out.println(counter);
			counter--;
		
	input.close();

	}
}