public class MathmaticalOperations{

    // Factorial method
    public static int factorial(int n){
        if (n < 0) return -1; // invalid case
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Prime number check
    public static boolean isPrime(int n){
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // GCD using simple loop
    public static int gcd(int a, int b){
        if (a < 0 || b < 0) return -1;

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Fibonacci number
    public static int fibonacci(int n){
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }


    // Main method for testing
    public static void main(String[] args){

        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Factorial of -2: " + factorial(-2));

        System.out.println("Is 7 prime? " + isPrime(7));
        System.out.println("Is 1 prime? " + isPrime(1));

        System.out.println("GCD of 12 and 18: " + gcd(12, 18));

        System.out.println("Fibonacci of 6: " + fibonacci(6));
        System.out.println("Fibonacci of 0: " + fibonacci(0));
    }
}
