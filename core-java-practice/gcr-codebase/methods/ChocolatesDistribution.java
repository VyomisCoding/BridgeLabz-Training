import java.util.*;
public class ChocolatesDistribution{
	
	public static int[] findRemainderAndQuotient(int number, int divisor) {
        int eachGets = number / divisor;
        int leftover = number % divisor;
        return new int[]{eachGets, leftover};
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] ans = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child will get: " + ans[0]);
        System.out.println("Chocolates left: " + ans[1]);
	}

}
