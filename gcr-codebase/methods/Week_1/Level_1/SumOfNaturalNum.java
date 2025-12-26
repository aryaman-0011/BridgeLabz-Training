import java.util.Scanner;

public class SumOfNaturalNum {
	
	// Method to calculate sum of n numbers
	public int natural(int n) {
		int sum = 0;
		for(int i = 1 ; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}


	public static void main(String[] args) {

		// Object
		SumOfNaturalNum sumOfNaturalNum = new SumOfNaturalNum();


		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a natural number: ");
		int num = input.nextInt();

		// Check
		if(num <= 0) {
			System.err.print("Entered number is not natural number!");
			return;
		}


		// Display output
		int naturalNum = sumOfNaturalNum.natural(num);
		System.out.print("Sum of " + num + " natural number are: " + naturalNum);
	
		input.close();

	}
}