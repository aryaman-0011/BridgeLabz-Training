import java.util.*;

	public class StringLength {

    	// User-defined method to find string length
    	public static int findLength(String str) {
        	int count = 0;

        	try {
            		// Infinite loop
            		while (true) {
                		str.charAt(count);
                		count++;
            		}
        	} catch (StringIndexOutOfBoundsException e) {
            		return count;
        	}
    	}

    	public static void main(String[] args) {

        	Scanner input = new Scanner(System.in);

        	// Taking input
        	System.out.print("Enter a string: ");
        	String text = input.next();

        	int customLength = findLength(text);
        	int builtInLength = text.length();

        	// Displaying results
        	System.out.println("Length using user-defined method: " + customLength);
        	System.out.println("Length using built-in length(): " + builtInLength);

        	input.close();
    	}
}
