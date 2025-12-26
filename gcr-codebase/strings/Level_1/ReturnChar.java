import java.util.*;

public class ReturnChar {

	// User-defined string -> char array
	public static char[] getChar (String s) {
		char[] chars = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			chars[i] = s.charAt(i);
		}

		return chars;
	}


	// Comparing user-defined and builInChar array
	public static boolean compareCharArrays (char[] arr1, char[] arr2) {
		
		if (arr1.length != arr2.length) {
			return false;
		}

		for(int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}

		return true;
	}
	
	
	public static void main (String[] args) {

		// Take user input
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.next();

		char[] manularChar = getChar(s);
		char[] builtInChar = s.toCharArray();

		boolean result = compareCharArrays(manularChar, builtInChar);


		// Display output
		System.out.println("\nChar using user-defined method: ");
		for(char c : manularChar) {
			System.out.print(c + " ");
		}

		System.out.println("\n Char using built-in method: ");
		for(char c : builtInChar) {
			System.out.print(c + " ");
		}

		if (result) {
			System.out.print("\nBoth substrings are equal");
		} else {
			System.out.print("\nSubstrings are not equal");
		}		

		input.close();
	}
}