import java.util.Scanner;

public class TextToLowercase {

    	// convert string to lowercase
    	static String convertToLowerCase(String text) {
        	String result = "";

        	for (int i = 0; i < text.length(); i++) {
            		char ch = text.charAt(i);

            		if (ch >= 'A' && ch <= 'Z') {
                		ch = (char)(ch + 32);
            		}

            		result = result + ch;
        	}

        	return result;
    	}

    	// Method to compare two strings
    	public static boolean compareStrings(String s1, String s2) {

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

    	public static void main(String[] args) {

        	Scanner input = new Scanner(System.in);

		System.out.print("Enter text: ");
        	String text = input.nextLine();
        	
        	String builtInLower = text.toLowerCase();

        	String customLower = convertToLowerCase(text);
        	boolean isSame = compareStrings(builtInLower, customLower);

        	// Display result
        	System.out.println("Built-in Lowercase: " + builtInLower);
        	System.out.println("Custom Lowercase: " + customLower);
        	System.out.println("Both are equal: " + isSame);

        	input.close();
    	}
}
