import java.util.*;
public class NaturalNumber {
	
	public static int sumTillN(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        int sum = sumTillN(n);
        System.out.println("Sum of first " + n + " natural numbers = " + sum);
	}

}
