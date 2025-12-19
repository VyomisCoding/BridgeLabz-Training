import java.util.Scanner;
public class SumUntilUserEntersZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        System.out.println("Enter a number (0 or negative to stop): ");
        double number = sc.nextDouble();
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = sc.nextDouble();

            if (value <= 0) {
                break;
            }

            total += value;
        }

        System.out.println("The total sum is " + total);
    }
}
