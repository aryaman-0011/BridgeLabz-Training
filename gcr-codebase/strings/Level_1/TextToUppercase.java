import java.util.*;


public class TextToUppercase {
	
	// Method for uppercase
	public static String toUpper (String text) {
		String result = "";
		
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				ch = (char)(ch-32);
			}

			result = result + ch;
		}
		return result;
	}


	// Method to compare strings
	public static boolean compareString (String s1, String s2) {
		
		if (s1.length() != s2.length()) {
			return false;
		}


		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}

		return true;
	}

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter text: ");
		String text = input.nextLine();

		String manualUpperCase = toUpper(text);
		String inBuiltUpperCase = text.toUpperCase();

		boolean isEqual = compareString(manualUpperCase, inBuiltUpperCase);

		System.out.println("Built-in Uppercase: " + inBuiltUpperCase);
        	System.out.println("Custom Uppercase: " + manualUpperCase);
        	System.out.println("Both are equal: " + isEqual);

		input.close();

	}
}



