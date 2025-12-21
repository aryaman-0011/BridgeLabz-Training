import java.util.Scanner;

class NumberCheckerThree {

    	// Count digits
    	public static int countDigits(int number) {
        	int count = 0;
        	number = Math.abs(number);

        	while (number > 0) {
            		count++;
            		number /= 10;
        	}
        	return count;
    	}

    	// Store digits in array
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

    	// Reverse digits array
    	public static int[] reverseArray(int[] digits) {
        	int[] reversed = new int[digits.length];
        	int j = 0;

        	for (int i = digits.length - 1; i >= 0; i--) {
            		reversed[j++] = digits[i];
        	}
        	return reversed;
    	}

    	// Compare two arrays
    	public static boolean areArraysEqual(int[] a, int[] b) {
        	if (a.length != b.length)
            		return false;

        	for (int i = 0; i < a.length; i++) {
            		if (a[i] != b[i])
                		return false;
        	}
        	return true;
    	}

    	// Palindrome check using digits
    	public static boolean isPalindrome(int[] digits) {
        	int[] reversed = reverseArray(digits);
        	return areArraysEqual(digits, reversed);
    	}

    	// Duck number check
    	public static boolean isDuckNumber(int[] digits) {
        	for (int d : digits) {
            		if (d != 0) {
                		return true;
            		}
        	}
        	return false;
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

        	int[] reversed = reverseArray(digits);
        	System.out.print("Reversed digits array: ");
        	for (int d : reversed) {
            		System.out.print(d + " ");
        	}
        	System.out.println();

        	System.out.println("Arrays equal: " + areArraysEqual(digits, reversed));

        	System.out.println("Is Palindrome Number: " + isPalindrome(digits));

        	System.out.println("Is Duck Number: " + isDuckNumber(digits));
    	}
}
