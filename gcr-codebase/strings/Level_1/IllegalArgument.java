import java.util.*;

public class IllegalArgument {
	
	// Mehtod to generate exception
	public static void generateException (String text) {
		System.out.println(text.substring(5, 2));
	}

	// Method to handle exception
	public static void handleException (String text) {
		
		try {
			System.out.println(text.substring(5, 2));
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException handled");
		} catch (RuntimeException e) {
			System.out.println("\nRuntime exception caught!");
		}

	}


	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string: ");
		String text = input.next();


		System.out.print("Generating exception");
		try {
			generateException(text);
		} catch (IllegalArgumentException e) {
			System.out.print("\nException occured in generateException()!");
		} catch (RuntimeException e) {
			System.out.println("\nRuntime exception caught!");
		}


		System.out.print("\nHandling Exception");
		handleException(text);

		input.close();
	}
}