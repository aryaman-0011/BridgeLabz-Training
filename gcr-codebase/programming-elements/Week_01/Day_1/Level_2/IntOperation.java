import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three integers
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        // Perform integer operations
        int result1 = a + b * c;   // multiplication before addition
        int result2 = a * b + c;   // multiplication before addition
        int result3 = c + a / b;   // division before addition
        int result4 = a % b + c;   // modulus before addition

        // Display results
        System.out.println("The results of Int Operations are: " 
                           + result1 + ", " + result2 + ", " + result3 + ", " + result4);

        scanner.close();
    }
}
