/* 8. Rewrite the above program 7 to find the factors of a number using the while loop
      Hint => 
	a. Get the input value for a variable named number and check if it is a positive integer.
	b. Create a counter variable and run the _**while**_ loop till the counter is less than the user input number. In each iteration of the loop, check if the number is 	   perfectly divisible by the counter. If true, print the value of the counter.

*/

import java.util.Scanner;

public class FactorsOfNumberWhile {
	public static void main(String[] args) {

	// Take input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
	int number = input.nextInt();


	// Logic to find factors
        if (number <= 0) {
		System.out.println("Number is not a positive integer!");
        } else {
		System.out.println("Factors of " + number + " are:");
		int counter = 1;
		while (counter < number) {
			if (number % counter == 0) {
				System.out.println(counter);
              		}
			counter++;
		}
        }

	input.close();

	}
}
