import java.util.*;

public class FriendsComparison {

    	// Method to find the youngest friend
    	public static int findYoungest(int[] ages) {
        	int minAge = ages[0];
        	int index = 0;

        	for (int i = 1; i < ages.length; i++) {
            		if (ages[i] < minAge) {
        	        	minAge = ages[i];
                		index = i;
            		}
        	}
	        return index; 
    	}

    	// Method to find the tallest friend
    	public static int findTallest(double[] heights) {
        	double maxHeight = heights[0];
        	int index = 0;

        	for (int i = 1; i < heights.length; i++) {
            		if (heights[i] > maxHeight) {
                		maxHeight = heights[i];
                		index = i;
            		}
        	}
        	return index;
    	}


	public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);

        	String[] names = {"Amar", "Akbar", "Anthony"};
        	int[] ages = new int[3];
        	double[] heights = new double[3];

        	// Take input
        	for (int i = 0; i < 3; i++) {
            		System.out.print("Enter age of " + names[i] + ": ");
            		ages[i] = input.nextInt();

            		System.out.print("Enter height of " + names[i] + " (in cm): ");
            		heights[i] = input.nextDouble();
        	}

        	// Find youngest and tallest
        	int youngestIndex = findYoungest(ages);
        	int tallestIndex = findTallest(heights);

        	// Display results
        	System.out.println("\nYoungest friend: " + names[youngestIndex]);
        	System.out.println("Tallest friend: " + names[tallestIndex]);

        	input.close();
    	}
}
