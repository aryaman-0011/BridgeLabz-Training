/*
You're working at GeoMeasure Solutions, a company that builds custom software for civil
engineers and architects. One of their core requirements is to compare line segments on
blueprints to determine if they are of equal length, or which one is longer.
 Problem Statement:
Build a Java application that:
● Allows a user to input the coordinates (x1, y1, x2, y2) of two lines.
● Uses a method to calculate the length of each line.
● Compares the two lengths and prints whether they are equal, or which is longer.
● Uses encapsulation to hide the internal data of each line.
● Uses constructors to initialize line objects.
Bonus: Support multiple line comparisons and store them in a list.
*/

package com.day_11.geomeasure;

import java.util.ArrayList;
import java.util.Scanner;

public class LineComparisonApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> results = new ArrayList<>();
		
		System.out.println("How many comparisons?");
		int comparisons = input.nextInt();
		
		for(int i = 1; i <= comparisons; i++) {
			System.out.println("\nComparison " + i);
			
			System.out.println("Enter coordinates for line 1 (x1 y1 x2 y2):");
			Line line1 = new Line(
					input.nextDouble(),
					input.nextDouble(),
					input.nextDouble(),
					input.nextDouble()
			);
			
			System.out.println("Enter coordinates for line 2 (x1 y1 x2 y2):");
			Line line2 = new Line(
					input.nextDouble(),
					input.nextDouble(),
					input.nextDouble(),
					input.nextDouble()
			);
			
			double length1 = line1.calculateLength();
			double length2 = line2.calculateLength();
			
			String result;
			if(length1 == length2) {
				result = "Both lines are equal in length";
			} else if(length1 > length2) {
				result = "Line 1 is longer than line 2";
			} else {
				result = "Line 2 is longer than line 1";
			}
			
			results.add(result);
			System.out.println(result);
		}
		
		// Display summary
		System.out.println("\n----- Summary of Comparisons ----");
		for(String res : results) {
			System.out.println(res);
		}
		
		input.close();
	}
}
