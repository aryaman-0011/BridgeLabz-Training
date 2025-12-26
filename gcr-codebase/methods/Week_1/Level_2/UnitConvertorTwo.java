import java.util.*;

public class UnitConvertorTwo {
	
	public static double convertYardsToFeet(double yards) {
		double yards2feet  = yards * 3;
		return yards2feet;
	}

	public static double convertFeetToYards(double feet) {
		double feet2yards  = feet *  0.333333;;
		return feet2yards;
	}

	public static double convertMeterToInch(double m) {
		double meters2inches  = m * 39.3701;
		return meters2inches;
	}

	public static double convertInchToMeter(double inch) {
		double inches2meters  = inch * 0.0254;
		return inches2meters;
	}

	public static double convertInchToCm(double inch) {
		double inches2cm   = inch * 2.54;
		return inches2cm;
	}



	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		double num = input.nextDouble();

		System.out.print("Yards -> Feet: " + convertYardsToFeet(num));
		System.out.print("\nFeet -> Yards: " + convertFeetToYards(num));
		System.out.print("\nMeter -> Inch: " + convertMeterToInch(num));
		System.out.print("\nInch -> Meter: " + convertInchToMeter(num));
		System.out.print("\nInch -> CM: " + convertInchToCm(num));


		input.close();
	}

}

