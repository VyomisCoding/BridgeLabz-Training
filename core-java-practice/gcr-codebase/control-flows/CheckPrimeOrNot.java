import java.util.Scanner;
public class CheckPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer to check for prime: ");
        int numbertocheck = sc.nextInt();
        boolean isPrime = true;
        if (numbertocheck <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numbertocheck); i++) {
                if (numbertocheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(numbertocheck + " is a prime number.");
        } else {
            System.out.println(numbertocheck + " is not a prime number.");
        }
    }
}
