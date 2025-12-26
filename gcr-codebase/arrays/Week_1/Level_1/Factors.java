/* 8. Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
      Hint => 
	a. Take the input for a number
	b. Find the factors of the number and save them in an array. For this create integer variable maxFactor and initialize to 10, factors array of size maxFactor and index variable to reflect the index of the array. 
	c. To find factors loop through the numbers from 1 to the number, find the factors, and add them to the array element by incrementing the index. If the index is equal to maxIndex, then need factors array to store more elements
	d. To store more elements, reset the maxIndex to twice its size, use the temp array to store the elements from the factors array, and eventually assign the factors array to the temp array
	e. Finally, Display the factors of the number
*/


import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		
		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();

		
		int maxFactor = 10;
		int[] factor = new int[maxFactor];
		int index = 0;

		for(int i = 1; i <= num; i++){
			if(num % i == 0) {
				
				if(index == maxFactor) {
					maxFactor = maxFactor * 2;
					int[] temp = new int[maxFactor];
					for(int j = 0; j < factor.length; j++) {
						temp[j] = factor[j];
					}
					factor = temp;
				}
				factor[index] = i;
				index++;
			}

		}

		
		System.out.println("Factors of " + num + " are: ");
		for(int i = 0; i < index; i++) {
			System.out.print(factor[i] + " ");
		}
	
		input.close();
	}
}