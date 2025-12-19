/* 8. Create a program to check if a number taken from the user is a Harshad Number.
      Hint => 
	a. A Harshad number is an integer which is divisible by the sum of its digits. For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
	b. Get an integer input for the number variable.
	c. Create an integer variable sum with initial value 0.
	d. Create a while loop to access each digit of the number.
	e. Inside the loop, add each digit of the number to sum.
	f. Check if the number is perfectly divisible by the sum.
	g. If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.
*/


import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {

		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();

		
		int sum = 0, originalNumber = number;
		
		while(originalNumber != 0) {
			int digit =  originalNumber % 10;
			sum = sum + digit;
			originalNumber = originalNumber / 10;
		}

		if(number % sum == 0) {
			System.out.println("Harshad Number!");
		} else {
			System.out.println("Not a Harshad Number!");
		}

		input.close();

	}
}