import java.util.Scanner;

public class StudentGradeCard {

    	// Method to generate random 2-digit PCM scores
    	public static int[][] generatePCMScores(int students) {

        	int[][] scores = new int[students][3]; // P C M

        	for (int i = 0; i < students; i++) {
            		scores[i][0] = (int) (Math.random() * 90) + 10; // Physics
            		scores[i][1] = (int) (Math.random() * 90) + 10; // Chemistry
            		scores[i][2] = (int) (Math.random() * 90) + 10; // Maths
        	}

        	return scores;
    	}

    	// Method to calculate total, average, percentage
    	public static double[][] calculateResults(int[][] scores) {

        	double[][] result = new double[scores.length][3]; // total, average, percentage

        	for (int i = 0; i < scores.length; i++) {
            		int total = scores[i][0] + scores[i][1] + scores[i][2];
            		double average = total / 3.0;
            		double percentage = (total / 300.0) * 100;

            		// Round off to 2 digits
            		average = Math.round(average * 100.0) / 100.0;
            		percentage = Math.round(percentage * 100.0) / 100.0;

            		result[i][0] = total;
            		result[i][1] = average;
            		result[i][2] = percentage;
        	}

        	return result;
    	}

    	// Method to calculate grade
    	public static String[][] calculateGrades(double[][] results) {

        	String[][] grades = new String[results.length][1];

        	for (int i = 0; i < results.length; i++) {
            		double percentage = results[i][2];

            		if (percentage >= 80)
                		grades[i][0] = "A";
            		else if (percentage >= 70)
                		grades[i][0] = "B";
            		else if (percentage >= 60)
                		grades[i][0] = "C";
            		else if (percentage >= 50)
                		grades[i][0] = "D";
            		else if (percentage >= 40)
                		grades[i][0] = "E";
            		else
                		grades[i][0] = "R";
        	}

        	return grades;
    	}

    	// Method to display scorecard
    	public static void displayScoreCard(
            	int[][] scores, double[][] results, String[][] grades) {

        	System.out.println("\nStudent Score Card");
        	System.out.println("--------------------------------------------------------------------------------");
        	System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAverage\t\tPercentage\tGrade");
        	System.out.println("--------------------------------------------------------------------------------");

        	for (int i = 0; i < scores.length; i++) {
            		System.out.println((i + 1) + "\t" +
                    	scores[i][0] + "\t" +
                    	scores[i][1] + "\t" +
                    	scores[i][2] + "\t" +
                    	(int) results[i][0] + "\t" +
                    	results[i][1] + "\t\t" +
                    	results[i][2] + "%\t\t" +
                    	grades[i][0]);
        	}
    	}

    	public static void main(String[] args) {

        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter number of students: ");
        	int students = sc.nextInt();

        	int[][] scores = generatePCMScores(students);
        	double[][] results = calculateResults(scores);
        	String[][] grades = calculateGrades(results);

        	displayScoreCard(scores, results, grades);

        	sc.close();
    	}
}
