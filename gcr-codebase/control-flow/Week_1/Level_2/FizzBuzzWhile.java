/* 5. Rewrite the program 4 FizzBuzz using the while loop */


import java.util.Scanner;

public class FizzBuzzWhile {
	public static void main(String[] args) {
		
		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();


		// Logic for printing FizzBuzz
		int i = 1;
		while(i <= number) {
			if(i % 3 == 0 && i % 5 == 0 ) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
			i++;
		}

		input.close();
	}
}