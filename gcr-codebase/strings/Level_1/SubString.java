import java.util.*;

public class SubString {
	
	// Create subString using charAt() method
	public static String subStringCharAt (String s, int start, int end) {
		
		String result = "";

		for (int i = start; i < end; i++) {
			result = result + s.charAt(i);
		}

		return result;
		
	}

	// Comparing two substrings
	public static boolean compareString (String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
	
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}

		return true;
	}


	public static void main(String[] args) {
		
		// Take user input
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.next();
		System.out.print("Enter start index: ");
		int start = input.nextInt();
		System.out.print("Enter end index: ");
		int end = input.nextInt();

		
		String charAtSubstring = subStringCharAt(s, start, end);
		String builtInString = s.substring(start, end);
	
		boolean result = compareString(charAtSubstring, builtInString);

		// Display output
		System.out.print("SubString using charAt(): " + charAtSubstring);
		System.out.print("\nSubString using subString(): " + builtInString);

		if (result) {
			System.out.print("\nBoth substrings are equal");
		} else {
			System.out.print("\nSubstrings are not equal");
		}

		input.close();

	}
}
		

		

	