import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate maximum number of handshakes using formula n*(n-1)/2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display output
        System.out.println("The maximum number of possible handshakes among " 
                           + numberOfStudents + " students is " + maxHandshakes);

        input.close();
    }
}
