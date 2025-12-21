import java.util.*;
public class TableSixToNine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		int number=sc.nextInt();
		int[] resultOfMultiplication = new int[4];
		int index=0;
		for(int i=6;i<=9;i++) {
			resultOfMultiplication[index] = number*i;
			index++;
		}
		System.out.println("Multiplication Table");
		index=0;
		for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + resultOfMultiplication[index]);
            index++;
        }
	}
}
