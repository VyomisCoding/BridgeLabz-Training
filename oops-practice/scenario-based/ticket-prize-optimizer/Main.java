public class Main{
    public static void main(String[] args){
        Ticket[] tickets ={ new Ticket(101, 2500), new Ticket(102, 1200), new Ticket(103, 5000), new Ticket(104, 1800), new Ticket(105, 900)};
        
        TicketSorter.quickSort(tickets, 0, tickets.length - 1);  // Sort tickets by price
        System.out.println("Cheapest Tickets:");
        for(int i = 0; i < Math.min(3, tickets.length); i++){
            System.out.println("Ticket " + tickets[i].ticketId + " → INR" + tickets[i].price);
        }
        System.out.println("\n Most Expensive Tickets:");
        for (int i = tickets.length - 1; i >= Math.max(0, tickets.length - 3); i--){
            System.out.println("Ticket " + tickets[i].ticketId + " → INR" + tickets[i].price);
        }
    }
}
