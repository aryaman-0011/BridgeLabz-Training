public class RandomValues {

    	// Method to generate array of 4-digit random numbers
    	public static int[] generateRandomArray(int size) {
        	int[] arr = new int[size];

        	for (int i = 0; i < size; i++) {
            		arr[i] = (int) (Math.random() * 9000) + 1000;
        	}

        	return arr;
    	}

    	// Method to find average, minimum and maximum
    	public static double[] findAverageMinMax(int[] numbers) {

        	int sum = 0;
        	int min = numbers[0];
        	int max = numbers[0];

        	for (int i = 0; i < numbers.length; i++) {
            	sum += numbers[i];
            	min = Math.min(min, numbers[i]);
            	max = Math.max(max, numbers[i]);
        	}

        	double avg = (double) sum / numbers.length;

        	return new double[]{avg, min, max};
    	}

    	
    	public static void main(String[] args) {

        	int[] numbers = generateRandomArray(5);

        	System.out.println("Generated 4-digit numbers:");
        	for (int i = 0; i < numbers.length; i++) {
            		System.out.print(numbers[i] + " ");
        	}

        	double[] result = findAverageMinMax(numbers);

        	System.out.println("\n\nAverage = " + result[0]);
        	System.out.println("Minimum = " + (int) result[1]);
        	System.out.println("Maximum = " + (int) result[2]);

    	}
}
