import java.util.Scanner;

public class ArrayIndexOutOfBounds {

	// Generate exception
    	static void generateException(String[] names) {
        	System.out.println(names[5]);
    	}

	// Handle Exception
    	static void handleException(String[] names) {
        	try {
            		System.out.println(names[5]);
        	} catch (ArrayIndexOutOfBoundsException e) {
            		System.out.println("ArrayIndexOutOfBoundsException occurred");
        	} catch (RuntimeException e) {
            		System.out.println("RuntimeException occurred");
        	}
    	}

    	public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);

        	int n = input.nextInt();
        	input.nextLine();

        	String[] names = new String[n];

        	for (int i = 0; i < n; i++) {
            		names[i] = input.nextLine();
        	}

        	generateException(names);
        	handleException(names);

        	input.close();
    	}
}
