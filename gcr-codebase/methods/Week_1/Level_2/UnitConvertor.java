import java.util.*;

public class UnitConvertor {
	
	public static double convertKmToMiles(double km) {
		double kmToMiles = km * 0.621371;
		return kmToMiles;
	}

	public static double convertMilesToKm(double mi) {
		double milesToKm = mi * 1.60934;
		return milesToKm;
	}

	public static double convertMetertoFeet(double m) {
		double meterToFeet = m * 3.28084;
		return meterToFeet;
	}

	public static double convertFeetToMeter(double f) {
		double feetToMeter = f * 0.3048;
		return feetToMeter;
	}



	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		double num = input.nextDouble();

		System.out.print("Km -> Mile: " + convertKmToMiles(num));
		System.out.print("\nMile -> Km: " + convertMilesToKm(num));
		System.out.print("\nMeter -> Feet: " + convertMetertoFeet(num));
		System.out.print("\nFeet -> Meter: " + convertFeetToMeter(num));

		input.close();
	}

}

