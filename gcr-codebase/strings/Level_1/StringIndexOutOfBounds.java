import java.util.*;

public class StringIndexOutOfBounds {
	
	public static void generateException (String text) {
		System.out.println("Character" + text.charAt(text.length()));
	}

	public static void handleException (String text) {
		
		try {
			System.out.println("Charatcer" + text.charAt(text.length()));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException handled");
		}

	}


	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string: ");
		String text = input.next();


		System.out.print("Generating exception");
		try {
			generateException(text);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.print("\nException occured in generateException()!");
		}


		System.out.print("\nHandling Exception");
		handleException(text);

		input.close();
	}
}