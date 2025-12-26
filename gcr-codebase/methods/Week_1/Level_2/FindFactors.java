import java.util.*;

public class FindFactors {
	

	// Mehtod to find factor of number
	public static int[] findFactorOfNumber(int num) {
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}
		}


		int[] factor = new int[count];
		int index = 0;

		// Store factor in array
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				factor[index++] = i;
			}
		}

		return factor;
	}


	// Sum of factor
	public static int factorSum(int[] factor) {
		int sum = 0;

		for(int i : factor) {
			sum = sum + i;
		}

		return sum;
	}

	// Product of factor
	public static long factorProduct(int[] factor) {
		int product = 1;
		
		for(int i : factor) {
			product = product * i;
		}

		return product;
	}

	// Sum of square of factor
	public static double sumOfSquare(int[] factor) {
		double sum = 0;
		for(int i : factor) {
			sum = sum + Math.pow(i, 2);
		}
		
		return sum;
	} 
					


	public static void main(String[] args) {
		
		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();

		int[] factor = findFactorOfNumber(num);


		// Display output
		System.out.print("Factors of " + num + " are: ");
		for(int i : factor) {
			System.out.print(i + " ");
		}
		System.out.print("\nSum of factors: " + factorSum(factor));
		System.out.print("\nProduct of factors: " + factorProduct(factor));
		System.out.print("\nSum of square of factors: " + sumOfSquare(factor));


		input.close();

	}
}
		

		
	

