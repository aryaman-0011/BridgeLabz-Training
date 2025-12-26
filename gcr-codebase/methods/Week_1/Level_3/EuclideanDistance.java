import java.util.Scanner;

class EuclideanDistance {

    	// Method to find Euclidean distance
    	public static double findDistance(int x1, int y1, int x2, int y2) {
        	double dx = Math.pow(x2 - x1, 2);
        	double dy = Math.pow(y2 - y1, 2);
        	return Math.sqrt(dx + dy);
    	}

    	// Method to find slope and y-intercept
    	public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        	double[] result = new double[2];

        	double m = (double) (y2 - y1) / (x2 - x1);
        	double b = y1 - m * x1;

        	result[0] = m;
        	result[1] = b;

        	return result;
    	}



    	public static void main(String[] args) {
	
        	Scanner input = new Scanner(System.in);

        	System.out.print("Enter x1 y1: ");
        	int x1 = input.nextInt();
        	int y1 = input.nextInt();

        	System.out.print("Enter x2 y2: ");
        	int x2 = input.nextInt();
        	int y2 = input.nextInt();

        	double distance = findDistance(x1, y1, x2, y2);
        	double[] line = findLineEquation(x1, y1, x2, y2);

        	System.out.println("\nEuclidean Distance = " + distance);
        	System.out.println("Slope (m) = " + line[0]);
        	System.out.println("Y-intercept (b) = " + line[1]);
        	System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);

		input.close();
    	}
}
