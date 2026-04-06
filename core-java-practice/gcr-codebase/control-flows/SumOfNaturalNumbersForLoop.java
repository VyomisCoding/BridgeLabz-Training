import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number");
        } else {
            int sumUsingForLoop = 0;

            for (int i = 1; i <= n; i++) {
                sumUsingForLoop += i;
            }

            int sumUsingFormula = n * (n + 1) / 2;

            System.out.println("Sum using for loop: " + sumUsingForLoop);
            System.out.println("Sum using formula: " + sumUsingFormula);

            if (sumUsingForLoop == sumUsingFormula) {
                System.out.println("Both computations are correct and match.");
            } else {
                System.out.println("The computations do not match.");
            }
        }

        sc.close();
    }
}
