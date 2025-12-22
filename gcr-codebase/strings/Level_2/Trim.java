import java.util.Scanner;

public class Trim {

    	// Method to find start and end index after trimming spaces
    	public static int[] findTrimIndexes(String text) {

        	int start = 0;
        	int end = text.length() - 1;

        	// Trim leading spaces
        	while (start <= end && text.charAt(start) == ' ') {
            		start++;
        	}

        	// Trim trailing spaces
        	while (end >= start && text.charAt(end) == ' ') {
            		end--;
        	}

        	return new int[] { start, end };
    	}

    	// Method to create substring
    	public static String createSubstring(String text, int start, int end) {

        	String result = "";

        	for (int i = start; i <= end; i++) {
            		result = result + text.charAt(i);
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

        	Scanner sc = new Scanner(System.in);

        	// Input
        	System.out.print("Enter a string: ");
        	String input = sc.nextLine();

        
        	int[] indexes = findTrimIndexes(input);
        	String manualTrim = createSubstring(input, indexes[0], indexes[1]);
        	String builtInTrim = input.trim();
        	boolean isSame = compareStrings(manualTrim, builtInTrim);


        	// Display output
        	System.out.println("\nTrimmed string (user-defined): [" + manualTrim + "]");
        	System.out.println("Trimmed string (built-in)    : [" + builtInTrim + "]");
        	System.out.println("Do both strings match?       : " + isSame);

        	sc.close();
    	}
}
