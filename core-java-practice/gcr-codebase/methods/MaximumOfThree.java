import java.util.*;
public class MaximumOfThree{
	static int findMax(int num1, int num2, int num3){//num1,num2,num3, here are parameters
        int max = num1;
        if (num2 > max) max = num2;
        if (num3 > max) max = num3;
        return max;
    }

	public static void main(String[] args){//num1,num2,num3, here are arguments
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        System.out.println("Maximum number is: " + findMax(num1, num2, num3));
	}
}