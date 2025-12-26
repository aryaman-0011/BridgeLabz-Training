import java.util.Scanner;


public class QuotientRemainder {
	

	// Method to find quotient and remainder
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int quotient = number / divisor;
		int remainder = number % divisor;

		return new int[]{quotient, remainder};
	}


	public static void main(String[] args) {
		
		// Object
		QuotientRemainder quotientRemainder = new QuotientRemainder();


		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = input.nextInt();
		System.out.print("Enter divisor: ");
		int divisor = input.nextInt();


		// Display output
		int[] result = quotientRemainder.findRemainderAndQuotient(num, divisor);
		System.out.print("Quotient: " + result[0] + "\nRemainder: " + result[1]);

		input.close();
	}
}