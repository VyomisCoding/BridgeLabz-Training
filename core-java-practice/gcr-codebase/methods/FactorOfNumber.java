import java.util.*;
public class FactorOfNumber {
	
	public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] arr = new int[count];
        int idx = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) arr[idx++] = i;
        }
        return arr;
    }
	
	public static int sumOfFactors(int[] arr) {//method for finding sum
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static int productOfFactors(int[] arr) {// method for finding product
        int prod = 1;
        for (int x : arr) prod *= x;
        return prod;
    }

    public static int sumOfSquare(int[] arr) {// method for finding sum of square
        int sqSum = 0;
        for (int x : arr) sqSum += (int) Math.pow(x, 2);
        return sqSum;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
        int n = sc.nextInt();

        int[] factors = getFactors(n);
        System.out.print("Factors: ");
        for (int x : factors) System.out.print(x + " ");
        System.out.println();
        System.out.println("Sum = " + sumOfFactors(factors));
        System.out.println("Sum of squares = " + sumOfSquare(factors));
        System.out.println("Product = " + productOfFactors(factors));
	}

}
