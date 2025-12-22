import java.util.*;

public class NullPointer {

	public static void generateException () {
		String text = null;
		System.out.println(text.length());
	}
	
	public static void handleException() {
		String text = null;

		try {
			System.out.print(text.length());
		} catch (NullPointerException e) {
			System.out.print("NullPointerException handled");
		}
	}
	
	public static void main (String[] args) {
		System.out.println("Generating exception");

		try {
			generateException();
		} catch (NullPointerException e) {
			System.out.print("Error occured in generateException()");
		}

		System.out.println("\nHandling Exception");
		handleException();
	}

}