/* 6. Create a program to find the mean height of players present in a football team.
      Hint => 
	a. The formula to calculate the mean is: mean = sum of all elements / number of elements
	b. Create a double array named heights of size 11 and get input values from the user.
	c. Find the sum of all the elements present in the array.
	d. Divide the sum by 11 to find the mean height and print the mean height of the football team
*/

import java.util.Scanner;

public class HeightOfPlayer {
	public static void main(String[] args) {
		
		// Take user input
		Scanner input = new Scanner(System.in);
		double[] heights = new double[11];
		System.out.println("Enter hieght of player:");
		for(int i = 0; i < heights.length; i++) {
			heights[i] = input.nextInt();
		}

		
		// Adding all heights
		double sum = 0;
		for(int i = 0; i < heights.length; i++) {
			sum = sum + heights[i];
		}

		// Mean of all heights
		double meanHeight = sum / 11;

		// Display result
		System.out.println("Mean heigth of football team is: " + meanHeight);
		
		input.close();
	}
}