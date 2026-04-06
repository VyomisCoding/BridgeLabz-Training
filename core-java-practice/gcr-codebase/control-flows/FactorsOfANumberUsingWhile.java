import java.util.Scanner;
public class FactorsOfANumberUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Enter a positive integer.");
        } else {
            int counter = 1;
            System.out.println("Factors of " + number + " are:");
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        }
    }
}
