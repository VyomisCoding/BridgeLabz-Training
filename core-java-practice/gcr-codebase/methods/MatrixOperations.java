import java.util.*;
public class MatrixOperations {
	
	public static int[][] createRandomMatrix(int rows, int cols) {	// for Creating random matrix
        int[][] mat = new int[rows][cols];
        Random r = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = r.nextInt(10); // random 0–9
            }
        }
        return mat;
    }
    
    public static int[][] addMatrices(int[][] A, int[][] B){ // Addition of two matrices
        int rows = A.length;
        int cols = A[0].length;

        int[][] C = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
    
    public static int[][] subtractMatrices(int[][] A, int[][] B){ // Subtraction of two matrices
        int rows = A.length;
        int cols = A[0].length;

        int[][] C = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }
    
    public static int[][] multiplyMatrices(int[][] A, int[][] B){// Multiplication of two matrices
        int r1 = A.length;
        int c1 = A[0].length;
        int r2 = B.length;
        int c2 = B[0].length;

        int[][] C = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int sum = 0;
                for (int k = 0; k < c1; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
        return C;
    }
    
    public static void printMatrix(int[][] M){ // Method for printing matrix
        for (int[] row : M) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args){ // main method--------------------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows for Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns for Matrix A: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows for Matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns for Matrix B: ");
        int c2 = sc.nextInt();

        int[][] A = createRandomMatrix(r1, c1);
        int[][] B = createRandomMatrix(r2, c2);

        System.out.println("\nMatrix A:");
        printMatrix(A);

        System.out.println("\nMatrix B:");
        printMatrix(B);
        
        if (r1 == r2 && c1 == c2) {         // Addition
        	System.out.println("\nA + B:");
            printMatrix(addMatrices(A, B));
        } else {
            System.out.println("\nAddition not possible (size mismatch).");
        }

        if (r1 == r2 && c1 == c2){          // Subtraction
            System.out.println("\nA - B:");
            printMatrix(subtractMatrices(A, B));
        } else {
            System.out.println("\nSubtraction not possible (size mismatch).");
        }

        if (c1 == r2) {                     // Multiplication
            System.out.println("\nA × B:");
            printMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("\nMultiplication not possible (A columns != B rows).");
        }
	}
}
