/* 12. Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the         
       result from both computations was correct. 
       Hint => 
	a. Take the user input number and check whether it's a Natural number
	b. If it's a natural number Compute using formulae as well as compute using while loop
	c. Compare the two results and print the result
*/

import java.util.Scanner;

public class SumNaturalNumberLoopFormula {
	public static void main(String[] args) {
		
		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find sum: ");
		int num = input.nextInt();


        	// Check if natural number
     		if (num <= 0) {
     	        	System.out.println("The number is not a natural number");
      	       		return;
    	        }

		// Store original value
		int originalSum = num;	
	
		// Calculating sum using while loop
		int totalUsingLoop = 0;
		while(num != 0){
			totalUsingLoop = totalUsingLoop + num;
			num--;
		}

		// Calculating sum using formula
		int totalUsingFormula = 0;
		if(num < 0) {
			System.out.println("The number is not a natural number");
		} else {
			// Print sum of n natural numbers logic
			totalUsingFormula = originalSum * (originalSum + 1) / 2;
		}
		
		// Check if loop and formula answer are same or not
		boolean isSame = false;
		if(totalUsingLoop == totalUsingFormula) {
			isSame = true;
		}

		
		// Display output
		if(isSame){
			System.out.println("Answers from while loop and formula is same which is: " + totalUsingFormula);
		} else{
			System.out.println("Answers from while loop is: " + totalUsingLoop + " and " + "Answers from formula is: " + totalUsingFormula);
		}

		input.close();

	}
}

		