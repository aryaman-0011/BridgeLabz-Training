class MatrixManipulationTwo {

    	// Create random matrix
	public static int[][] createRandomMatrix(int rows, int cols) {
        	int[][] matrix = new int[rows][cols];

        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		matrix[i][j] = (int)(Math.random() * 10); // 0–9
            		}
        	}
        	return matrix;
    	}

    	// Transpose of matrix
    	public static int[][] transpose(int[][] matrix) {
        	int rows = matrix.length;
        	int cols = matrix[0].length;
        	int[][] trans = new int[cols][rows];

        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		trans[j][i] = matrix[i][j];
            		}
        	}
        	return trans;
    	}

    	// Determinant of 2x2 matrix
    	public static int determinant2x2(int[][] m) {
        	return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    	}

    	// Determinant of 3x3 matrix
    	public static int determinant3x3(int[][] m) {
        	return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             	- m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             	+ m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    	}

    	// Inverse of 2x2 matrix
    	public static double[][] inverse2x2(int[][] m) {
        	int det = determinant2x2(m);
        	if (det == 0) return null;

        		double[][] inv = new double[2][2];
        		inv[0][0] =  m[1][1] / (double)det;
        		inv[0][1] = -m[0][1] / (double)det;
        		inv[1][0] = -m[1][0] / (double)det;
        		inv[1][1] =  m[0][0] / (double)det;

        	return inv;
    	}

    	// Inverse of 3x3 matrix
    	public static double[][] inverse3x3(int[][] m) {
        	int det = determinant3x3(m);
        	if (det == 0) return null;

        	double[][] inv = new double[3][3];
	
        	inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double)det;
        	inv[0][1] = (m[0][2]*m[2][1] - m[0][1]*m[2][2]) / (double)det;
        	inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double)det;

        	inv[1][0] = (m[1][2]*m[2][0] - m[1][0]*m[2][2]) / (double)det;
        	inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double)det;
        	inv[1][2] = (m[0][2]*m[1][0] - m[0][0]*m[1][2]) / (double)det;

        	inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double)det;
        	inv[2][1] = (m[0][1]*m[2][0] - m[0][0]*m[2][1]) / (double)det;
        	inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double)det;

        	return inv;
    	}

    	// Display matrix (int)
    	public static void displayMatrix(int[][] matrix) {
        	for (int[] row : matrix) {
            		for (int val : row) {
                		System.out.print(val + "\t");
            		}
	            	System.out.println();
        	}
    	}

    	// Display matrix (double)
    	public static void displayMatrix(double[][] matrix) {
        	for (double[] row : matrix) {
            		for (double val : row) {
                		System.out.print(Math.round(val * 100.0) / 100.0 + "\t");
            		}
            		System.out.println();
        	}
    	}



    	public static void main(String[] args) {

        	int[][] matrix2 = createRandomMatrix(2, 2);
        	int[][] matrix3 = createRandomMatrix(3, 3);

        	System.out.println("2x2 Matrix:");
        	displayMatrix(matrix2);

        	System.out.println("\nTranspose:");
        	displayMatrix(transpose(matrix2));

        	System.out.println("Determinant (2x2): " +
                determinant2x2(matrix2));

        	double[][] inv2 = inverse2x2(matrix2);
        	if (inv2 != null) {
            		System.out.println("Inverse (2x2):");
            		displayMatrix(inv2);
        	} else {
            		System.out.println("Inverse not possible (det = 0)");
        	}

        	System.out.println("\n3x3 Matrix:");
        	displayMatrix(matrix3);

        	System.out.println("Determinant (3x3): " +
                determinant3x3(matrix3));

        	double[][] inv3 = inverse3x3(matrix3);
        	if (inv3 != null) {
            		System.out.println("Inverse (3x3):");
            		displayMatrix(inv3);
        	} else {
            		System.out.println("Inverse not possible (det = 0)");
        	}
    	}
}