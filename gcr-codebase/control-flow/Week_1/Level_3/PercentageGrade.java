/* 3. Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 
      Hint => 
	a. Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
*/


import java.util.Scanner;

public class PercentageGrade {
	public static void main(String[] args) {

		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter physics maks: ");
		int physics = input.nextInt();
		System.out.println("Enter chemistry maks: ");
		int chemistry = input.nextInt();
		System.out.println("Enter maths maks: ");
		int maths = input.nextInt();

		

		// Calculate Average
		double average = (physics + chemistry + maths) / 3.0;
		System.out.println("Average marsk: " + average);
		
		// Calculate grade
		if(average >= 80) {
			System.out.println("Average marks - " + average);
			System.out.println("Grade A");
			System.out.println("Remarks - Level 4, above agency-normalized standards");
		} else if(average >= 70) {
			System.out.println("Average marks - " + average);
			System.out.println("Grade B");
			System.out.println("Remarks - Level 3, at agency-normalized standards");
		} else if(average >= 60) {
			System.out.println("Average marks - " + average);
			System.out.println("Grade C");
			System.out.println("Remarks - Level 2, below, but aroaching agency-normalized standards");
		} else if(average >= 50) {
			System.out.println("Average marks - " + average);
			System.out.println("Grade D");
			System.out.println("Remarks - Level 1, well below agency-normalized standards");
		} else if(average >= 40) {
			System.out.println("Average marks - " + average);
			System.out.println("Grade E");
			System.out.println("Remarks - Level 1, too below agency-normalized standards");
		} else {
			System.out.println("Average marks - " + average);
			System.out.println("Grade R");
			System.out.println("Remedial standards");
		}

		input.close();

	}
}