import java.util.Scanner;

public class VowelConsonantCount {

    	// Method to check whether a character is vowel, consonant, or not a letter
    	public static String checkChar(char ch) {

        	// Convert uppercase to lowercase
        	if (ch >= 'A' && ch <= 'Z') {
            		ch = (char) (ch + 32);
        	}

        	// Check if character is a letter
        	if (ch >= 'a' && ch <= 'z') {

            		// Check for vowels
            		if (ch == 'a' || ch == 'e' || ch == 'i' || 
                		ch == 'o' || ch == 'u') {
                		return "Vowel";
            		} else {
                		return "Consonant";
            		}
        	}

        	return "Not a Letter";
    	}

    	// Method to count vowels and consonants
    	public static int[] countVowelsAndConsonants(String text) {

        	int vowels = 0;
        	int consonants = 0;

        	for (int i = 0; i < text.length(); i++) {
            		char ch = text.charAt(i);
            			String result = checkChar(ch);

            			if (result.equals("Vowel")) {
                			vowels++;
            			} else if (result.equals("Consonant")) {
                			consonants++;
            			}
        	}

        	// Return counts in an array
        	return new int[] { vowels, consonants };
    	}

    	public static void main(String[] args) {

        	Scanner sc = new Scanner(System.in);

        	// Input
        	System.out.print("Enter a string: ");
        	String text = sc.nextLine();

        	int[] result = countVowelsAndConsonants(text);

        	// Display result
        	System.out.println("\nVowels Count     : " + result[0]);
        	System.out.println("Consonants Count : " + result[1]);

        	sc.close();
    	}
}
