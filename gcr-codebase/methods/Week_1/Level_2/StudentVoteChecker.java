import java.util.*;

public class StudentVoteChecker {

    	// Method to check if a student can vote
    	public boolean canStudentVote(int age) {

        	// Validate negative age
        	if (age < 0) {
            		return false;
        	}

        	if (age >= 18) {
            		return true;
        	}

        	return false;
    	}


    	public static void main(String[] args) {

        	Scanner input = new Scanner(System.in);
        	StudentVoteChecker checker = new StudentVoteChecker();

        	int[] ages = new int[10];

        	// Take input and check voting eligibility
        	for (int i = 0; i < ages.length; i++) {
            		System.out.print("Enter age of student " + (i + 1) + ": ");
            		ages[i] = input.nextInt();

            		if (checker.canStudentVote(ages[i])) {
                		System.out.println("Student " + (i + 1) + " can vote.");
            		} else {
                		System.out.println("Student " + (i + 1) + " cannot vote.");
            		}
        	}

        	input.close();
    	}
}
