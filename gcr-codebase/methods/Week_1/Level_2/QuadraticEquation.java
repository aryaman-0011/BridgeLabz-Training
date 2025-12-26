import java.util.Scanner;

public class QuadraticEquation {

    	// Method to find roots of quadratic equation
    	public static double[] findRoots(double a, double b, double c) {

        	double delta = Math.pow(b, 2) - 4 * a * c;

        	// If delta is negative, no real roots
        	if (delta < 0) {
            		return new double[0];
        	}

        	// If delta is zero, one root
        	if (delta == 0) {
            		double root = -b / (2 * a);
            		return new double[]{root};
        	}

        	// If delta is positive, two roots
        	double sqrtDelta = Math.sqrt(delta);
        	double root1 = (-b + sqrtDelta) / (2 * a);
        	double root2 = (-b - sqrtDelta) / (2 * a);

        	return new double[]{root1, root2};
    	}

    
    	public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);

        	System.out.print("Enter a: ");
        	double a = input.nextDouble();

        	System.out.print("Enter b: ");
        	double b = input.nextDouble();

        	System.out.print("Enter c: ");
	        double c = input.nextDouble();

        	double[] roots = findRoots(a, b, c);

        	if (roots.length == 2) {
            		System.out.println("Two roots:");
            		System.out.println("Root 1 = " + roots[0]);
            		System.out.println("Root 2 = " + roots[1]);
        	} else if (roots.length == 1) {
            		System.out.println("One root:");
            		System.out.println("Root = " + roots[0]);
        	} else {
            		System.out.println("No real roots");
        	}

        	input.close();
    	}
}
