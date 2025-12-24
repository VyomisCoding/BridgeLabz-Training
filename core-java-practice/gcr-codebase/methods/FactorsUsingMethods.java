import java.util.*;
public class FactorsUsingMethods {
	
	public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] arr = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) arr[idx++] = i;
        }
        return arr;
	}
	
	public static int greatestFactor(int[] arr) {
        int max = arr[0];
        for (int f : arr) if (f > max) max = f;
        return max;
    }

    public static int sumOfFactors(int[] arr) {
        int sum = 0;
        for (int f : arr) sum += f;
        return sum;
    }

    public static long productOfFactors(int[] arr) {
        long prod = 1;
        for (int f : arr) prod *= f;
        return prod;
    }
    
    public static double productOfCube(int[] arr) {
        double result = 1;
        for (int f : arr) {
            result *= Math.pow(f, 3);
        }
        return result;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] factors = getFactors(n);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nGreatest Factor = " + greatestFactor(factors));
        System.out.println("Sum of Factors = " + sumOfFactors(factors));
        System.out.println("Product of Factors = " + productOfFactors(factors));
        System.out.println("Product of Cubes = " + productOfCube(factors));

	}

}
