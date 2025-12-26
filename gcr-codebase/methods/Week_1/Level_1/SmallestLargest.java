import java.util.Scanner;

public class SmallestLargest {
	
	// Method to find smallest and largest
	public int[] smallestLargestNum(int a, int b, int c) {

		int smallest, largest;

		// find smallest
		if(a <= b && a <= c) {
			smallest = a;
		} else if(b <= a && b <= c) {
			smallest = b;
		} else {
			smallest = c;
		}

		// find largest
		if(a >= b && a >= c) {
			largest = a;
		} else if(b >= a && b >= c) {
			largest = b;
		} else {
			largest = c;
		}

		return new int[]{smallest, largest};


	}


	public static void main(String[] args) {
		
		// Object
		SmallestLargest smallestLargest = new SmallestLargest();


		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first = input.nextInt();
		System.out.print("Enter second number: ");
		int second = input.nextInt();
		System.out.print("Enter third number: ");
		int third = input.nextInt();


		// Display result
		int[] result = smallestLargest.smallestLargestNum(first, second, third);
		System.out.print("Smallest number: " +  result[0]);
		System.out.print("\nLargest number: " +  result[1]);
		
		input.close();

	}
}