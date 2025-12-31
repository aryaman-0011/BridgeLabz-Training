/*
17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
- Use arrays and for-loop.
- Record score.
- Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.*;

public class OnlineQuiz {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);


		String[] questions = {
            		"1. Which keyword is used to inherit a class in Java?",
            		"2. Which data type is used to store decimal values?",
            		"3. Which method is the entry point of a Java program?",
            		"4. Which operator is used for logical AND?",
            		"5. Which collection does not allow duplicate values?"
		};


		String[][] options = {
			{"A. extends", "B. implements", "C. inherit", "D. super"},
            		{"A. int", "B. float", "C. char", "D. boolean"},
            		{"A. start()", "B. run()", "C. main()", "D. init()"},
            		{"A. &", "B. &&", "C. |", "D. ||"},
            		{"A. List", "B. Map", "C. Set", "D. Queue"}
		};

		int score = 0;


		for (int i = 0; i < questions.length; i++) {
			System.out.println("\n" + questions[i]);

			for (int j = 0; j < options[i].length; j++) {
				System.out.println(options[i][j]);

			}


			System.out.print("\nEnter your answers (A/B/C/D): ");
			char answer = input.next().toUpperCase().charAt(0);
		
			switch (i) {
		
				case 0:
					if (answer == 'A') {
						score++;
					}
					break;

				case 1:
					if (answer == 'B') {
						score++;
					}
					break;

				case 2:
					if (answer == 'C') {
						score++;
					}
					break;
		
				case 3:
					if (answer == 'B') {
						score++;
					}
					break;

				case 4:
					if (answer == 'C') {
						score++;
					}
					break;

				default:
					System.out.print("Invalid option");
			}

		}

		System.out.print("\nQuiz Completed");
		System.out.print("\nYour Score: " + score + "/5");
		
		input.close();
	}
}


			

		