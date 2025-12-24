import java.util.*;
public class MatrixManipulation{
	
	// a) Creation of a random matrix---------------------------------------------------------------------------------------------------------------------
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random r = new Random();
        int[][] mat = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = r.nextInt(10);  // values 0–9
            }
        }
        return mat;
    }
	
    public static int[][] transpose(int[][] M){  // Transpose--------------------------------------------------------------------------------------------------------------
        int rows = M.length;
        int cols = M[0].length;

        int[][] T = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                T[j][i] = M[i][j];
            }
        }
        return T;
    }
    
    public static int determinant2x2(int[][] M){ // Determinant of 2x2---------------------------------------------------------------------------------------------
        return (M[0][0] * M[1][1]) - (M[0][1] * M[1][0]);
    }

    public static int determinant3x3(int[][] M){ // Determinant of 3x3
        int a = M[0][0] * (M[1][1] * M[2][2] - M[1][2] * M[2][1]);
        int b = M[0][1] * (M[1][0] * M[2][2] - M[1][2] * M[2][0]);
        int c = M[0][2] * (M[1][0] * M[2][1] - M[1][1] * M[2][0]);

        return a - b + c;
    }
    
    public static double[][] inverse2x2(int[][] M){ // Inverse of 2x2-----------------------------------------------------------------------------

        int det = determinant2x2(M);
        if (det == 0) return null;

        double[][] inv = new double[2][2];

        inv[0][0] = M[1][1] / (double) det;
        inv[0][1] = -M[0][1] / (double) det;
        inv[1][0] = -M[1][0] / (double) det;
        inv[1][1] = M[0][0] / (double) det;

        return inv;
    }
    
    public static double[][] inverse3x3(int[][] M){ // Inverse of 3x3-------------------------------------------------------------------------------

        int det = determinant3x3(M);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        // Cofactor Matrix
        inv[0][0] =  (M[1][1] * M[2][2] - M[1][2] * M[2][1]);
        inv[0][1] = -(M[1][0] * M[2][2] - M[1][2] * M[2][0]);
        inv[0][2] =  (M[1][0] * M[2][1] - M[1][1] * M[2][0]);

        inv[1][0] = -(M[0][1] * M[2][2] - M[0][2] * M[2][1]);
        inv[1][1] =  (M[0][0] * M[2][2] - M[0][2] * M[2][0]);
        inv[1][2] = -(M[0][0] * M[2][1] - M[0][1] * M[2][0]);

        inv[2][0] =  (M[0][1] * M[1][2] - M[0][2] * M[1][1]);
        inv[2][1] = -(M[0][0] * M[1][2] - M[0][2] * M[1][0]);
        inv[2][2] =  (M[0][0] * M[1][1] - M[0][1] * M[1][0]);
        
        // Divide by determinant and transpose (adjoint)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inv[i][j] = inv[i][j] / det;
            }
        }

        return inv;
    }
    
    public static void printMatrix(int[][] M){ // Display Matrix----------------------------------------------------------------------------------
        for (int[] row : M) {
            for (int v : row) {
                System.out.printf("%4d", v);
            }
            System.out.println();
        }
    }

    public static void printDoubleMatrix(double[][] M) {
        for (double[] row : M) {
            for (double v : row) {
                System.out.printf("%8.3f", v);
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter cols: ");
        int c = sc.nextInt();

        int[][] M = createRandomMatrix(r, c);

        System.out.println("\nMatrix M:");
        printMatrix(M);

        System.out.println("\nTranspose:");
        int[][] T = transpose(M);
        printMatrix(T);
        
        if (r == 2 && c == 2) {
            System.out.println("\nDeterminant (2x2): " + determinant2x2(M));

            System.out.println("Inverse (2x2):");
            double[][] inv = inverse2x2(M);
            if (inv == null) System.out.println("No inverse (det = 0)");
            else printDoubleMatrix(inv);
        }

        if (r == 3 && c == 3) {
            System.out.println("\nDeterminant (3x3): " + determinant3x3(M));
            System.out.println("Inverse (3x3):");
            double[][] inv = inverse3x3(M);
            if (inv == null) System.out.println("No inverse (det = 0)");
            else printDoubleMatrix(inv);
        }
	}
}
