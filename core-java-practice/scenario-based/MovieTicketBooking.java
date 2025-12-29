import java.util.*;
public class MovieTicketBooking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;

        do {
            System.out.print("Enter the movie type (2D / 3D): ");
            String movieType = sc.next();

            System.out.print("Enter the seat type you prefer (gold / silver): ");
            String seatType = sc.next();

            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.next();

            int bill = 0;
            switch (movieType.toUpperCase()) {
                case "2D":
                    bill += 150;
                    break;
                case "3D":
                    bill += 250;
                    break;
                default:
                    System.out.println("Invalid movie type");
            }
            if (seatType.equalsIgnoreCase("gold")) {
                bill += 100;
            } else {
                bill += 50;
            }

            if (snacks.equalsIgnoreCase("yes")) {
                bill += 80;
            }

            System.out.println("Your Total Bill is: ₹" + bill);

            System.out.print("Next customer? (yes/no): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes"));
	}
}
