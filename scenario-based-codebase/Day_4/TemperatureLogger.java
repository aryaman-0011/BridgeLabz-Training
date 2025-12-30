/*
11. Temperature Logger
Record temperatures over 7 days.
- Use array and for-loop.
- Find average and max temperature.
- Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.*;

public class TemperatureLogger {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		// Intialize array for storing temperature of 7 days
		double[] temperature = new double[7];

		// Taking temperature input
		double totalTemp = 0;
		for (int i = 0; i < 7; i++) {
			System.out.print("\nEnter temperature of Day " + (i + 1) + " (in C): ");
			temperature[i] = input.nextDouble();
			totalTemp += temperature[i];
		}


		// Find max temperature
		double max = temperature[0];
		for (int i = 0 ; i < 7; i++) {
			if(temperature[i] > max) {
				max = temperature[i];
			}
		}
		System.out.print("\nMax temperature among 7 days is: " + max);

		// Find average temperature
		double average = totalTemp / 7;
		System.out.print("\nAverage temparature of 7 days is: " + average);
		

		input.close();
		
	}

}