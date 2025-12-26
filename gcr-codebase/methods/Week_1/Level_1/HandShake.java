import java.util.Scanner;

// Method to find number of hand shakes
public class HandShake {
	
	// Method to find number of hand shakes
	public int maxHandShake(int n) {
		int handShake = (n * (n - 1)) / 2;
		return handShake;
	}

	
	public static void main(String[] args) {

		// Created object for handshake class
		HandShake handShake = new HandShake();


		// Taking user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int numberOfStudents = input.nextInt();
		

		// Display output
		int possibleHandShake = handShake.maxHandShake(numberOfStudents);
		System.out.print("Number of possible handshakes: " + possibleHandShake);

		input.close();

	}
}
		