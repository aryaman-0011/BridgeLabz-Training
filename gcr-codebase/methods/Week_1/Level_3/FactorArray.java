import java.util.Scanner;

class FactorArray {

    	// Find factors of a number and return as array
    	public static int[] findFactors(int number) {

        	// First loop: count factors
        	int count = 0;
        	for (int i = 1; i <= number; i++) {
            	if (number % i == 0) {
                	count++;
            		}
        	}

        	// Create array with exact size
        	int[] factors = new int[count];

        	// Second loop: store factors
        	int index = 0;
        	for (int i = 1; i <= number; i++) {
            		if (number % i == 0) {
                		factors[index++] = i;
            		}
        	}
        	return factors;
    	}

    	// Greatest factor using factors array
    	public static int greatestFactor(int[] factors) {
        	int max = Integer.MIN_VALUE;
        	for (int f : factors) {
            		if (f > max) {
                		max = f;
            		}
        	}
        	return max;
    	}

    	// Sum of factors
    	public static int sumOfFactors(int[] factors) {
        	int sum = 0;
        	for (int f : factors) {
            		sum += f;
        	}
        	return sum;
    	}

    	// Product of factors
    	public static long productOfFactors(int[] factors) {
        	long product = 1;
        	for (int f : factors) {
            		product *= f;
        	}
        	return product;
    	}

    	// Product of cube of factors
    	public static double productOfCubes(int[] factors) {
        	double product = 1;
        	for (int f : factors) {
            		product *= Math.pow(f, 3);
        	}
        	return product;
    	}



    	public static void main(String[] args) {

        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter a number: ");
        	int number = input.nextInt();

        	int[] factors = findFactors(number);

        	System.out.print("Factors: ");
        	for (int f : factors) {
            		System.out.print(f + " ");
        	}
        	System.out.println();

        	System.out.println("Greatest Factor: " + greatestFactor(factors));
        	System.out.println("Sum of Factors: " + sumOfFactors(factors));
        	System.out.println("Product of Factors: " + productOfFactors(factors));
        	System.out.println("Product of Cube of Factors: " + productOfCubes(factors));

		input.close();
    	}
}
