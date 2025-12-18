/* 11. Rewrite the above program to print the greatest factor of a number beside itself using a while loop.
       Hint => 
	a. Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
	b. Create a variable counter and assign counter = number - 1; Use the while loop till the counter is equal to 1.
	c. Inside the loop, check if the number is perfectly divisible by the counter then assign the counter to greatestFactor variable and break the loop.
	d. Display the greatestFactor variable outside the loop

*/

import java.util.Scanner;

public class GreatestFactorWhile {
	public static void main(String[] args) {

		// Take input from user
		Scanner input = new Scanner(System.in);
        	System.out.print("Enter a number: ");
		int number = input.nextInt();

		// Logic to calculate greatest factor
		int greatestFactor = 1;
		if(number <= 1) {
			System.out.println("Number itself is only a factor!");
		} else {
			int counter = number - 1;
			while (counter >= 1) {
				if (number % counter == 0) {
					greatestFactor = counter;
					break;
				}
				counter--;
			}
	            System.out.println("Greatest factor of " + number + " (besides itself) is: " + greatestFactor);
		}

		input.close();	

	}
}