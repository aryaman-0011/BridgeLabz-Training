import java.util.*;

public class NumberFormat {


	// Generate error
    	static void generateException(String text) {
        	int num = Integer.parseInt(text);
        	System.out.println(num);


    	}
	
	// Handle exception
    	static void handleException(String text) {

        	try {
            		int num = Integer.parseInt(text);
            		System.out.println(num);
        	} catch (NumberFormatException e) {
            		System.out.println("NumberFormatException occurred");
        	} catch (RuntimeException e) {
            		System.out.println("RuntimeException occurred");
        	}
    	}

	public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);

        	String text = sc.nextLine();
	
        	generateException(text);
		handleException(text);

        	input.close();
    	}
}
