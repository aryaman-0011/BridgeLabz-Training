import java.util.Scanner;

public class SearchMatrix2 {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                row++;      // move down
            }
            else {
                col--;      // move left
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements (row-wise):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        boolean found = searchMatrix(matrix, target);

        if (found) {
            System.out.println("Target found in matrix");
        } else {
            System.out.println("Target NOT found in matrix");
        }

        sc.close();
    }
}
