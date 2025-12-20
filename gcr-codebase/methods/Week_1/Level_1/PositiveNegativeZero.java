import java.util.Scanner;

public class PositiveNegativeZero {
	
	// Method to determine sign of a number
	public int determineSign(int n) {

		if(n < 0) {
			return -1;
		} else if(n == 0) {
			return 0;
		} else {
			return 1;
		}
	}


	public static void main(String[] args) {

		// Created object for PositiveNegativeZero class
		PositiveNegativeZero positiveNegativeZero = new PositiveNegativeZero();


		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();


		// Display output
		int sign = positiveNegativeZero.determineSign(num);
		System.out.print(sign);

		input.close();

	}
}