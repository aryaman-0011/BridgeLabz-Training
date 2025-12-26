import java.util.Scanner;

public class WordsWithLength2D {

    	// Method to find string length without using length()
    	public static int findLength(String str) {
        	int count = 0;
        	try {
            		while (true) {
                		str.charAt(count);
                		count++;
            		}
        	} catch (StringIndexOutOfBoundsException e) {
            		return count;
        	}
    	}

    	// Method to split text into words without using split()
    	public static String[] manualSplit(String text) {

        	int length = findLength(text);

        	// Count words
        	int wordCount = 1;
        	for (int i = 0; i < length; i++) {
            		if (text.charAt(i) == ' ') {
                		wordCount++;
            		}
        	}

        	// Store space indexes
        	int[] spaceIndex = new int[wordCount + 1];
        	int idx = 0;
        	spaceIndex[idx++] = -1;

        	for (int i = 0; i < length; i++) {
            		if (text.charAt(i) == ' ') {
                		spaceIndex[idx++] = i;
            		}
        	}
        	spaceIndex[idx] = length;

        	// Extract words
        	String[] words = new String[wordCount];
        	for (int i = 0; i < wordCount; i++) {
            		String word = "";
            		for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                		word = word + text.charAt(j);
            		}
            		words[i] = word;
        	}

        	return words;
    	}

    	// Method to convert words array into 2D array (word + length)
    	public static String[][] wordsWithLength(String[] words) {

        	String[][] result = new String[words.length][2];

        	for (int i = 0; i < words.length; i++) {
            		result[i][0] = words[i];
            		result[i][1] = String.valueOf(findLength(words[i]));
        	}

        	return result;
    	}

    	public static void main(String[] args) {

        	Scanner sc = new Scanner(System.in);

        	// Input
        	System.out.print("Enter text: ");
        	String input = sc.nextLine();

        	// Split text
        	String[] words = manualSplit(input);

        	// Create 2D array
        	String[][] output = wordsWithLength(words);

        	// Display in tabular format
        	System.out.println("\nWord\t\tLength");
        	System.out.println("---------------------");

        	for (int i = 0; i < output.length; i++) {
            		int len = Integer.parseInt(output[i][1]); // Convert String to Integer
            		System.out.println(output[i][0] + "\t\t" + len);
        	}

        	sc.close();
    	}
}
