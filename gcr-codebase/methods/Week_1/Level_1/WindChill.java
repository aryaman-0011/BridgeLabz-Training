import java.util.*;

public class WindChill {
	
	// Method to calculate wind chill
	public static double calculateWindChill(double temperature, double windSpeed) {
		double windChills = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

		return windChills;
	}


	public static void main(String[] args) {
		
		// Object
		WindChill windChill = new WindChill();


		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter wind speed: ");
		double windSpeed = input.nextDouble();
		System.out.print("Enter temperature: ");
		double temp = input.nextDouble();

		// Display output
		double result = windChill.calculateWindChill(temp, windSpeed);
		System.out.print("Wind chill: " + result);

		input.close();
	}
}
		