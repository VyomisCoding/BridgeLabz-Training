import java.util.Scanner;
public class SumOfNaturalNumbersCompare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number");
        } else {
            // Sum using while loop
            int sumUsingLoop = 0;
            int counter = 1;

            while (counter <= number) {
                sumUsingLoop += counter;
                counter++;
            }

            // Sum using formula
            int sumUsingFormula = number * (number + 1) / 2;

            System.out.println("Sum using while loop: " + sumUsingLoop);
            System.out.println("Sum using formula: " + sumUsingFormula);

            if (sumUsingLoop == sumUsingFormula) {
                System.out.println("Both computations are correct and match.");
            } else {
                System.out.println("The computations do not match.");
            }
        }
    }
}
