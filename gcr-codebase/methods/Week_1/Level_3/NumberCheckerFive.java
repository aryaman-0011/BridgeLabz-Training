import java.util.Scanner;

class NumberCheckerFive {

    	// find sum of proper divisors
    	public static int sumOfProperDivisors(int number) {
        	int sum = 0;

        	for (int i = 1; i <= number / 2; i++) {
            		if (number % i == 0) {
                	sum += i;
            		}
        	}
        	return sum;
    	}

    	// Perfect Number
    	public static boolean isPerfectNumber(int number) {
        	if (number <= 0)
            		return false;

        	return sumOfProperDivisors(number) == number;
    	}

    	// Abundant Number
    	public static boolean isAbundantNumber(int number) {
        	if (number <= 0)
            		return false;

        	return sumOfProperDivisors(number) > number;
    	}

    	// Deficient Number
    	public static boolean isDeficientNumber(int number) {
        	if (number <= 0)
            		return false;

        	return sumOfProperDivisors(number) < number;
   	}

    	// factorial of a digit
    	public static int factorial(int n) {
        	int fact = 1;
        	for (int i = 1; i <= n; i++) {
            		fact *= i;
        	}
        	return fact;
    	}

    	// Strong Number
    	public static boolean isStrongNumber(int number) {
        	int temp = number;
        	int sum = 0;

        	while (temp > 0) {
            		int digit = temp % 10;
            		sum += factorial(digit);
            		temp /= 10;
        	}
        	return sum == number;
    	}



	public static void main(String[] args) {

        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter a number: ");
        	int number = input.nextInt();

        	System.out.println("Is Perfect Number: " + isPerfectNumber(number));

        	System.out.println("Is Abundant Number: " + isAbundantNumber(number));

        	System.out.println("Is Deficient Number: " + isDeficientNumber(number));

        	System.out.println("Is Strong Number: " + isStrongNumber(number));
    	}
}
