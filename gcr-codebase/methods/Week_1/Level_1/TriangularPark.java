import java.util.Scanner;

public class TriangularPark {
	
	// Mehtod to calculate number of rounds
	public double numberOfRounds(int a, int b, int c) {
		int perimeter = a + b + c;
		double rounds = 5000 / perimeter;

		return rounds;
	} 

	public static void main(String[] args) {
		
		// Created object for triangular park class
		TriangularPark triangularPark = new TriangularPark();
	

		// Taking user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First side of triangle (in m): ");
		int firstSide = input.nextInt();
		System.out.print("Enter Second side of triangle (in m): ");
		int secondSide = input.nextInt();
		System.out.print("Enter Third side of triangle (in m): ");
		int thirdSide = input.nextInt();


		// Display output
		double numOfRound = triangularPark.numberOfRounds(firstSide, secondSide, thirdSide);
		System.out.print("Athlete have to complete: " + numOfRound);

		input.close();
	}
}


		