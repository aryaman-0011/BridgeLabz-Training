import java.util.Scanner;

public class ShortestAndLongestWord {

    	// Method to find string length
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

    	// Method to create 2D array of word and its length
    	public static String[][] wordsWithLength(String[] words) {

        	String[][] result = new String[words.length][2];

        	for (int i = 0; i < words.length; i++) {
            		result[i][0] = words[i];
            		result[i][1] = String.valueOf(findLength(words[i]));
        	}

        	return result;
    	}

    	// Method to find shortest and longest word index
    	public static int[] findShortestAndLongest(String[][] data) {

        	int minIndex = 0;
        	int maxIndex = 0;

        	int minLength = Integer.parseInt(data[0][1]);
        	int maxLength = Integer.parseInt(data[0][1]);

        	for (int i = 1; i < data.length; i++) {
            		int length = Integer.parseInt(data[i][1]);

            		if (length < minLength) {
                		minLength = length;
                		minIndex = i;
            		}

            		if (length > maxLength) {
                		maxLength = length;
                		maxIndex = i;
            		}
        	}

        	return new int[] { minIndex, maxIndex };
    	}

    	public static void main(String[] args) {

        	Scanner sc = new Scanner(System.in);

        	// Input
        	System.out.print("Enter text: ");
        	String input = sc.nextLine();

        	String[] words = manualSplit(input);
        	String[][] data = wordsWithLength(words);
        	int[] result = findShortestAndLongest(data);
        	System.out.println("\nWord\t\tLength");
        	System.out.println("---------------------");

        	for (int i = 0; i < data.length; i++) {
            		int len = Integer.parseInt(data[i][1]);
            		System.out.println(data[i][0] + "\t\t" + len);
        	}

        	// Display shortest and longest
        	System.out.println("\nShortest Word : " + data[result[0]][0]);
        	System.out.println("Longest Word  : " + data[result[1]][0]);

        	sc.close();
    	}
}
