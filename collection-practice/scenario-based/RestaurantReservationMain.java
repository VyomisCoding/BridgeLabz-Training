import java.util.*;

class TableAlreadyReservedException extends Exception{    // custom exception 
    public TableAlreadyReservedException(String msg){
        super(msg);
    }
}

class Table{                  // Table class
    int tableNumber;
    boolean isReserved;
    public Table(int tableNumber){
        this.tableNumber = tableNumber;
        this.isReserved = false;
    }
}

class Reservation{            // Reservation class
    int tableNumber;
    String customerName;
    String time;

    public Reservation(int tableNumber, String customerName, String time){
        this.tableNumber = tableNumber;
        this.customerName = customerName;
        this.time = time;
    }
}

class ReservationManager{    // Manager class
    Map<Integer, Table> tables = new HashMap<>();
    List<Reservation> reservations = new ArrayList<>();
    
    public ReservationManager(int numberOfTables){    // add tables in constructor
        for (int i = 1; i <= numberOfTables; i++){
            tables.put(i, new Table(i));
        }
    }
    
    public void reserveTable(int tableNumber, String name, String time) throws TableAlreadyReservedException{    // Reserve table
        Table t = tables.get(tableNumber);
        if(t == null){
            System.out.println("Invalid Table Number");
            return;
        }
        if(t.isReserved){
            throw new TableAlreadyReservedException("Table " + tableNumber + " already reserved!");
        }
        t.isReserved = true;
        reservations.add(new Reservation(tableNumber, name, time));
        System.out.println("Table Reserved Successfully!");
    }
    
    public void cancelReservation(int tableNumber){                // Cancel reservation
        Table t = tables.get(tableNumber);
        if(!t.isReserved){
            System.out.println("Table not reserved");
            return;
        }
        t.isReserved = false;
        reservations.removeIf(r -> r.tableNumber == tableNumber);  // remove reservation entry
        System.out.println("🗑 Reservation Canceled!");
    }
    
    public void showAvailableTables(){                             // Show available tables
        System.out.println("🪑 Available Tables:");
        for (int num : tables.keySet()) {
            if (!tables.get(num).isReserved) {
                System.out.println("Table " + num);
            }
        }
    }
}

public class RestaurantReservationMain{                            //  main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReservationManager manager = new ReservationManager(5);
        int choice;
        do{
            System.out.println("\n===== Restaurant Menu =====");
            System.out.println("1. Reserve Table");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. Show Available Tables");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Table number: ");
                    int tn = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Customer name: ");
                    String name = sc.nextLine();
                    System.out.print("Time Slot: ");
                    String time = sc.nextLine();
                    try{
                        manager.reserveTable(tn, name, time);
                    }catch(TableAlreadyReservedException e) {
                        System.out.println("No" + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter table number to cancel: ");
                    manager.cancelReservation(sc.nextInt());
                    break;
                case 3:
                    manager.showAvailableTables();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
            }
        }while(choice != 4);
    }
}
