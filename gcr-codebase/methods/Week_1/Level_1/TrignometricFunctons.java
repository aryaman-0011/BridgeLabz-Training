import java.util.*;

public class TrignometricFunctons {
	
	// Method to calculate radian, sine, cosine, tangent
	public double[] calculateTrigonometricFunctions(double angle) {
		
		double radians = Math.toRadians(angle);
		double sin = Math.sin(radians);
        	double cos = Math.cos(radians);
        	double tan = Math.tan(radians);

		return new double[]{sin, cos, tan};
	}


	public static void main(String[] args) {

		// Object
		TrignometricFunctons trignometricFunctons = new TrignometricFunctons();

		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter angle: ");
		double angle = input.nextInt();

		// Display output
		double[] result = trignometricFunctons.calculateTrigonometricFunctions(angle);
		System.out.print("Sine: " + result[0] + "\nCosine: " + result[1] + "\nTangent: " + result[2]);
		
		input.close();
	}
}
		
