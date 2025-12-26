import java.util.Scanner;

public class ReverseNumberUsingArray {
    	public static void main(String[] args) {

        	// Take input from user
        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter a number: ");
        	int number = input.nextInt();

		// Logic to reverse number
        	int temp = number;
        	int count = 0;

        	while (temp != 0) {
            		count++;
            		temp = temp / 10;
        	}
	
        	int[] digits = new int[count];
        	temp = number;

        	for (int i = 0; i < count; i++) {
            		digits[i] = temp % 10;
            		temp = temp / 10;
        	}

		// Display output
        	System.out.print("Reversed number: ");
        	for (int i = 0; i < count; i++) {
            		System.out.print(digits[i]);
        	}

        	input.close();
    	}
}
