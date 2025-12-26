import java.util.Scanner;

class NumberCheckerTwo {

    	// 1. Count digits
    	public static int countDigits(int number) {
        	int count = 0;
        	number = Math.abs(number);

        	while (number > 0) {
            		count++;
            		number /= 10;
        	}
        	return count;
    	}

    	// 2. Store digits in array
    	public static int[] getDigitsArray(int number) {
        	number = Math.abs(number);
        	int count = countDigits(number);
        	int[] digits = new int[count];

        	for (int i = count - 1; i >= 0; i--) {
            		digits[i] = number % 10;
            		number /= 10;
        	}
        	return digits;
    	}

    	// 3. Sum of digits
    	public static int sumOfDigits(int[] digits) {
        	int sum = 0;
        	for (int d : digits) {
            		sum += d;
        	}
        	return sum;
    	}

    	// 4. Sum of squares of digits
    	public static int sumOfSquares(int[] digits) {
        	int sum = 0;
        	for (int d : digits) {
            		sum += Math.pow(d, 2);
        	}
        	return sum;
    	}

    	// 5. Harshad number check
    	public static boolean isHarshadNumber(int number, int[] digits) {
        	int sum = sumOfDigits(digits);
        	return number % sum == 0;
    	}

    	// 6. Frequency of each digit (2D array)
    	public static int[][] digitFrequency(int[] digits) {
        	int[][] freq = new int[10][2];

        	for (int i = 0; i < 10; i++) {
            		freq[i][0] = i; // digit
            		freq[i][1] = 0; // frequency
        	}

        	for (int d : digits) {
            		freq[d][1]++;
        	}
        	return freq;
    	}


    	public static void main(String[] args) {

        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a number: ");
        	int number = sc.nextInt();

        	int[] digits = getDigitsArray(number);

        	System.out.println("Count of digits: " + countDigits(number));
        	System.out.print("Digits array: ");
        	for (int d : digits) {
            		System.out.print(d + " ");
        	}
        	System.out.println();
        	System.out.println("Sum of digits: " + sumOfDigits(digits));
        	System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        	System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

        	int[][] freq = digitFrequency(digits);
        	System.out.println("Digit  Frequency");
        	for (int i = 0; i < 10; i++) {
            		if (freq[i][1] > 0) {
                		System.out.println(freq[i][0] + "      " + freq[i][1]);
            		}
        	}
    	}
}
