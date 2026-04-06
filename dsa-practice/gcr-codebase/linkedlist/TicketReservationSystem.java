// Ticket node
class Ticket{
    int ticketId;
    String customer, movie, time;
    int seat;
    Ticket next;

    Ticket(int id, String c, String m, int s, String t){
        ticketId = id;
        customer = c;
        movie = m;
        seat = s;
        time = t;
    }
}

public class TicketReservationSystem{
    Ticket head = null;

    void bookTicket(int id, String c, String m, int s, String t){  // add ticket
        Ticket tk = new Ticket(id, c, m, s, t);

        if (head == null) {
            head = tk;
            tk.next = head;
            return;
        }

        Ticket temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = tk;
        tk.next = head;
    }

    void cancelTicket(int id){   // remove ticket by ID
        Ticket temp = head, prev = null;
        do{
            if (temp.ticketId == id){
                if (temp == head){
                    Ticket last = head;
                    while (last.next != head) last = last.next;
                    head = head.next;
                    last.next = head;
                }else{
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        }while(temp != head);
    }

    void displayTickets(){   // display tickets
        if (head == null) return;
        Ticket temp = head;
        do{
            System.out.println(temp.ticketId + " " + temp.customer + " " + temp.movie);
            temp = temp.next;
        } while (temp != head);
    }

    void countTickets(){     // count tickets
        if (head == null){
            System.out.println(0);
            return;
        }
        int count = 0;
        Ticket temp = head;
        do{
            count++;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Total tickets: " + count);
    }
}
