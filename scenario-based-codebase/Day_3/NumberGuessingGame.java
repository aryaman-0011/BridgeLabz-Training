/*
7. The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
- Use do-while loop.
- Give hints like "Too high" or "Too low".
- Count attempts and exit after 5 wrong tries.
*/

import java.util.*;

public class NumberGuessingGame {

	public static void main (String[] args) {
		
		// Generate random number
		Random rand = new Random();
		int randomNum = rand.nextInt(100) + 1;

		Scanner input = new Scanner(System.in);
		int count = 0;
		int guess;	

		

		do {
			// Take user input
			System.out.print("\nEnter number you guessed: ");
			guess = input.nextInt();

			if (guess > randomNum) {
				System.out.print("Too High");
				count++;
			} else if (guess < randomNum) {
				System.out.print("Too Low");
				count++;
			} else {
				System.out.print("Congrats!! You won");
				break;
			}

		} while (count < 5);

		if (count == 5 && guess != randomNum) {
			System.out.print("Game over! The correct number is: " + randomNum);
		}
	

		input.close();
			
	}
}