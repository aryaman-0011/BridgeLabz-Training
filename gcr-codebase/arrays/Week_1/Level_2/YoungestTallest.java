import java.util.Scanner;

public class YoungestTallest {
    	public static void main(String[] args) {

        	Scanner input = new Scanner(System.in);
        	String[] names = {"Amar", "Akbar", "Anthony"};
        	int[] age = new int[3];
        	double[] height = new double[3];


        	// Take input from user
        	for (int i = 0; i < 3; i++) {
            		System.out.println("Enter details of " + names[i]);
			System.out.print("Enter age: ");
            		age[i] = input.nextInt();

            		System.out.print("Enter height: ");
            		height[i] = input.nextDouble();
        	}


		// Logic to find youngest and tallest
        	int youngestIndex = 0;
        	int tallestIndex = 0;
        	for (int i = 1; i < 3; i++) {
            		if (age[i] < age[youngestIndex]) {
                		youngestIndex = i;
            		}
            		if (height[i] > height[tallestIndex]) {
                		tallestIndex = i;
            		}
        	}

        	// Output results
        	System.out.println("Youngest Friend: " + names[youngestIndex] + " (Age: " + age[youngestIndex] + ")");
        	System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + height[tallestIndex] + ")");

        	input.close();
    	}
}
