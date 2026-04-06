import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.println("Enter the day (1-31): ");
        int day = sc.nextInt();
        System.out.println("Enter the year (e.g., 2024): ");
        int year = sc.nextInt();

        // Given formulas
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;

        System.out.println("Day of the week is: " + d0 );
    }
}
