import java.util.Scanner;

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;
    boolean booked = false;

    void bookTicket(String movie, String seat, double amount) {
        if (!booked) {
            movieName = movie;
            seatNumber = seat;
            price = amount;
            booked = true;
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
        } else {
            System.out.println("House full!!! sorry..... Ticket already booked");
        }
    }
    void displayTicket() {
        if (booked) {
            System.out.println("Price: $" + price);
        } else {
            System.out.println("Ticket have not booked yet....");
        }
    }
}

public class MovieTicketBooking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MovieTicket ticket = new MovieTicket();

        ticket.displayTicket();
        ticket.bookTicket("Dragon", "A10", 120);
        ticket.bookTicket("Dragon", "A10", 120);
        ticket.displayTicket();

    }
    
}
