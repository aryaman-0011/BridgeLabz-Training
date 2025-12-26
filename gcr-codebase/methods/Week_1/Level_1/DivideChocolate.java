import java.util.Scanner;

public class DivideChocolate {
	
	// Mehtod to find remaining chocos and how many choco student get
	public int[] getAndRemainingChoco(int choco, int child) {
		int studentGet = choco / child;
		int remainingChoco = choco % child;

		return new int[]{studentGet, remainingChoco};		
	}


	public static void main(String[] args) {
		
		// Object
		DivideChocolate divideChocolate = new DivideChocolate();


		// take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of chocolates: ");
		int numberOfchocolates = input.nextInt();
		System.out.print("Enter number of students: ");
		int numberOfChildren = input.nextInt();


		int[] result = divideChocolate.getAndRemainingChoco(numberOfchocolates, numberOfChildren);

		
		// Display output
		System.out.print("Each student will get " + result[0] + ", remaining chocolate: " + result[1]);

		input.close();
	}
}
		