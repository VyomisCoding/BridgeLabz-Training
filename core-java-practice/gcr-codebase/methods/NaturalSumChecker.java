import java.util.*;
public class NaturalSumChecker {
	
	public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int recur = recursiveSum(n);
        int form = formulaSum(n);
        System.out.println("Recursive Sum = " + recur);
        System.out.println("Formula Sum = " + form);

        if (recur == form) {
            System.out.println("Both results match!");
        } else {
            System.out.println("Results do NOT match!");
        }
	}

}
