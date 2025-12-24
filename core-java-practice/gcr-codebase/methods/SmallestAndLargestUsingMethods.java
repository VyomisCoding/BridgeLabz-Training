import java.util.*;
public class SmallestAndLargestUsingMethods {
	
	public static int[] findSmallestAndLargest(int x, int y, int z) {
        int smallest = x;
        int largest = x;
        
        if (y < smallest) smallest = y;
        if (z < smallest) smallest = z;
        if (y > largest) largest = y;
        if (z > largest) largest = z;
        
        return new int[]{smallest, largest};
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int[] res = findSmallestAndLargest(num1, num2, num3);

        System.out.println("Smallest: " + res[0]);
        System.out.println("Largest: " + res[1]);
	}

}
