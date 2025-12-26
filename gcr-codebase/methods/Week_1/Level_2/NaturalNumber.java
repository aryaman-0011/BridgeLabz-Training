import java.util.Scanner;

public class NaturalNumber {
	

	// Sum using recursion
	public static int recursionSum(int n) {
		if(n == 1) {
			return 1;
		}
		return n + recursionSum(n - 1);
		
	}

	// Sum using formula
	public static int formulaSum(int n) {
		return n * (n + 1) / 2;
	}



	public static void main(String[] args) {
		
		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a natural number: ");
		int num = input.nextInt();


		// Check
		if(num <= 0) {
			System.err.print(num + " is not a natural number");
			System.exit(0);
		}


		int recursiveSum = recursionSum(num);
		int formulaSum = formulaSum(num);

		
		// Display output
		System.out.print("\nSum using recursion: " + recursiveSum);
		System.out.print("\nSum using formula: " + formulaSum);

		if(recursiveSum == formulaSum) {
			System.out.print("\nBoth the methods produce same output!");
		} else {
			System.out.print("\nBoth methods produce different result!");
		}

		input.close();

	}
}


		