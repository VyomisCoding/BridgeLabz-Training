import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CinemaManager manager = new CinemaManager();
        int choice;
        do{
            System.out.println("\nCinemaTime – Movie Manager");
            System.out.println("1. Add Movie");
            System.out.println("2. Search Movie");
            System.out.println("3. Display All Movies");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();   // consume newline
            switch(choice){
                case 1:
                    try{
                        System.out.print("Enter Movie Title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter Show Time (HH:MM): ");
                        String time = sc.nextLine();
                        manager.addMovie(title, time);
                    }catch(InvalidTimeFormatException e){
                        System.out.println("Wrong " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter keyword to search: ");
                    manager.searchMovie(sc.nextLine());
                    break;
                case 3:
                    manager.displayAllMovies();
                    break;
                case 4:
                    manager.generateReport();
                    break;
                case 5:
                    System.out.println("Exiting Cinema Manager...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}
