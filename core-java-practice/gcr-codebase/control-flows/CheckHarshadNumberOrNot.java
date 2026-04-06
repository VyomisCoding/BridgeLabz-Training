
// A Harshad number is an integer which is divisible by the sum of its digits. 
// For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).

import java.util.Scanner;

public class CheckHarshadNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Harshad number: ");
        int numbertocheck = sc.nextInt();
        int originalNumber = numbertocheck;
        int sumOfDigits = 0;
        while (originalNumber != 0) {
            sumOfDigits += originalNumber % 10;
            originalNumber /= 10;
        }
        if (numbertocheck % sumOfDigits == 0) {
            System.out.println(numbertocheck + " is a Harshad number.");
        } else {
            System.out.println(numbertocheck + " is not a Harshad number.");
        }
    }
}
