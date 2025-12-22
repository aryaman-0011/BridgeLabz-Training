import java.util.Scanner;

public class SplitTextWithoutSplit {

    	// Method to find length of string
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

    	// Method to split text into words
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

        	// Extract words using indexes
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

    	// Method to compare two string arrays
    	public static boolean compareArrays(String[] arr1, String[] arr2) {

        	if (arr1.length != arr2.length) {
            		return false;
        	}

        	for (int i = 0; i < arr1.length; i++) {
            		if (!arr1[i].equals(arr2[i])) {
                		return false;
            		}
        	}

        	return true;
    	}

    	public static void main(String[] args) {

        	Scanner input = new Scanner(System.in);

        	// Taking input
        	System.out.print("Enter text: ");
        	String text = input.nextLine();

        	String[] manualWords = manualSplit(text);
        	String[] builtInWords = text.split(" ");
        	boolean result = compareArrays(manualWords, builtInWords);

        	// Display output
        	System.out.println("\nWords using user-defined method:");
        	for (String w : manualWords) {
            		System.out.println(w);
        	}

        	System.out.println("\nWords using built-in split():");
        	for (String w : builtInWords) {
            		System.out.println(w);
        	}

        	System.out.println("\nDo both results match? " + result);

        	input.close();
    	}
}
