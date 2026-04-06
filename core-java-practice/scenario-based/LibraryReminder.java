import java.util.*;
public class LibraryReminder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int finePerDay = 5;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Book " + i);

            System.out.print("Enter due date (day): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter return date (day): ");
            int returnDate = sc.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * finePerDay;
                System.out.println("Late by " + lateDays + " days. Fine: ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine.");
            }
            System.out.println();
        }
	}
}
