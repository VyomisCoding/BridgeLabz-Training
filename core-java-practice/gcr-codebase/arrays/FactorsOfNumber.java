import java.util.*;
public class FactorsOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number;");
		int number = sc.nextInt();

        int maximumFactor = 10;
        int[] factors = new int[maximumFactor];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maximumFactor) {
                    maximumFactor = maximumFactor * 2;
                    int[] temp = new int[maximumFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index] = i;
                index++;
            }
        }
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }	
	}
}
