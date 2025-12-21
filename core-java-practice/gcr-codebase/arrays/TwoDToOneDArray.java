import java.util.*;
public class TwoDToOneDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] singleArray = new int[rows * columns];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                singleArray[index] = matrix[i][j];
                index++;
            }
        }
        System.out.println("1D Array elements:");
        for (int i = 0; i < singleArray.length; i++) {
            System.out.print(singleArray[i] + " ");
        }

	}
}
