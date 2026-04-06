// An abundant number is an integer in which the sum of all the divisors of the number is greater than the number itself. For example,
// Divisor of 12: 1, 2, 3, 4, 6
// Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12



import java.util.Scanner;

public class CheckAbundantNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer to check if it is an abundant number: ");
        int numbertocheck = sc.nextInt();
        int sumOfDivisors = 0;
        for (int i = 1; i <= numbertocheck / 2; i++) {
            if (numbertocheck % i == 0) {
                sumOfDivisors += i;
            }
        }
        if (sumOfDivisors > numbertocheck) {
            System.out.println(numbertocheck + " is an abundant number.");
        } else {
            System.out.println(numbertocheck + " is not an abundant number.");
        }
    }
}
