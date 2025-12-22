import java.util.Scanner;

class StudentScore {

    	// Generate random PCM inputores (2-digit)
    	public static int[][] generatePCMScores(int students) {

        	int[][] inputores = new int[students][3];

        	for (int i = 0; i < students; i++) {
            		inputores[i][0] = (int)(Math.random() * 90) + 10; 
            		inputores[i][1] = (int)(Math.random() * 90) + 10; 
            		inputores[i][2] = (int)(Math.random() * 90) + 10; 
        	}
        	return inputores;
    	}

    	// Calculate Total, Average, Percentage
    	public static double[][] calculateResults(int[][] inputores) {

        	double[][] result = new double[inputores.length][3];

        	for (int i = 0; i < inputores.length; i++) {

            		int total = inputores[i][0] + inputores[i][1] + inputores[i][2];
            		double average = total / 3.0;
            		double percentage = (total / 300.0) * 100;

            		// Round to 2 decimal places
            		average = Math.round(average * 100.0) / 100.0;
            		percentage = Math.round(percentage * 100.0) / 100.0;

            		result[i][0] = total;
            		result[i][1] = average;
            		result[i][2] = percentage;
        	}
        	return result;
   	 }

    	// Display inputorecard using tabs
    	public static void displayScoreCard(int[][] inputores, double[][] results) {

        	System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        	for (int i = 0; i < inputores.length; i++) {
            		System.out.println((i + 1) + "\t" + inputores[i][0] + "\t" + inputores[i][1] + "\t\t" + inputores[i][2] + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        	}
    	}



    	public static void main(String[] args) {

        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter number of students: ");
        	int students = input.nextInt();

        	int[][] inputores = generatePCMScores(students);
        	double[][] results = calculateResults(inputores);

        	displayScoreCard(inputores, results);

		input.close();
    	}
}
