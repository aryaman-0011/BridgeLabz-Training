import java.util.*;

public class PlayerHeight {
	
	// Method to generate random height
	public static int[] generateHeight(int size) {
		int[] height = new int[size];
		Random random = new Random();
		
		for (int i = 0; i < size; i++) {
			height[i] = 150 + random.nextInt(101);
		}
		return height;
	}


	// Method to find sum of height
	public static int findSum(int[] height) {
		int sum = 0;
		for(int h : height) {
			sum = sum + h;
		}
		return sum;
	}

	
	// Method to find mean height
	public static double meanHeight(int[] height) {
		int sum = findSum(height);
		return (double) sum / height.length;
	}


	// Mehtod to find shortest height
	public static int shortHeight(int[] height) {
		int min = height[0];
		for(int h : height) {
			if(h < min) {
				min = h;
			}
		}
		return min;
	}


	// Mehtod to find tallest height
	public static int tallHeight(int[] height) {
		int max = height[0];
		for(int h : height) {
			if(h > max) {
				max = h;
			}
		}
		return max;
	}


	public static void main(String[] args) {
		int[] height = generateHeight(11);
		

		// Dsiplay output
		System.out.println("Heights of football player (in cm)");
		for(int h : height) {
			System.out.print(h + " ");
		}

		System.out.println("\nSum of all Height: " + findSum(height) + " cm");
        	System.out.println("Mean Height: " + meanHeight(height) + " cm");
		System.out.println("Shortest Height: " + shortHeight(height) + " cm");
        	System.out.println("Tallest Height: " + tallHeight(height) + " cm");

	}
}
