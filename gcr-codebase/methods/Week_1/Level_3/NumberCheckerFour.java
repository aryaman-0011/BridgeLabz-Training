import java.util.Scanner;

class NumberCheckerFour {

    	// Check Prime Number
    	public static boolean isPrime(int number) {
        	if (number <= 1)
            	return false;

        	for (int i = 2; i <= Math.sqrt(number); i++) {
            		if (number % i == 0)
                		return false;
        	}
        	return true;
    	}

    	// Check Neon Number
	public static boolean isNeonNumber(int number) {
        	int square = number * number;
        	int sum = 0;

        	while (square > 0) {
            		sum += square % 10;
            		square /= 10;
        	}
        	return sum == number;
    	}

    	// Check Spy Number
	public static boolean isSpyNumber(int number) {
        	int sum = 0;
        	int product = 1;

        	while (number > 0) {
            		int digit = number % 10;
            		sum += digit;
            		product *= digit;
            		number /= 10;
        	}
        	return sum == product;
    	}

    	// Check Automorphic Number
    	public static boolean isAutomorphicNumber(int number) {
        	int square = number * number;
        	int temp = number;

        	while (temp > 0) {
            		if (temp % 10 != square % 10)
                		return false;
            		temp /= 10;
            		square /= 10;
        	}
        	return true;
    	}

    	// Check Buzz Number
    	public static boolean isBuzzNumber(int number) {
        	return (number % 7 == 0 || number % 10 == 7);
    	}



    	public static void main(String[] args) {
	
		// Take user input
        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter a number: ");
        	int number = input.nextInt();

		// Display output
        	System.out.println("Is Prime Number: " + isPrime(number));
        	System.out.println("Is Neon Number: " + isNeonNumber(number));
        	System.out.println("Is Spy Number: " + isSpyNumber(number));
        	System.out.println("Is Automorphic Number: " + isAutomorphicNumber(number));
        	System.out.println("Is Buzz Number: " + isBuzzNumber(number));

		input.close();
    	}
}
