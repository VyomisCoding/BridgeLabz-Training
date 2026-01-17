import java.util.*;

public class SearchIn2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            // map 1D mid to 2D row/col
            int r = mid / cols;
            int c = mid % cols;

            if (matrix[r][c] == target) {
                return true;
            }

            if (matrix[r][c] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix values row-wise:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        boolean found = searchMatrix(matrix, target);

        System.out.println("Found? " + found);
    }
}
