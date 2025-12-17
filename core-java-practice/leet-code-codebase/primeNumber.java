import java.util.Scanner;

class PrimeNumber {

    // Method to check whether a number is prime or not
    static boolean isPrime(int n) {

        // 0 and 1 are not prime numbers
        if (n <= 1) {
            return false;
        }

        // Check divisibility from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {

            // If divisible, number is not prime
            if (n % i == 0) {
                return false;
            }
        }

        // If no divisor is found, number is prime
        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

        sc.close();
    }
}
