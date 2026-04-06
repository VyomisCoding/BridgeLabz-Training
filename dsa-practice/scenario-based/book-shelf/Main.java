import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BookShelf shelf = new BookShelf();

        int choice;

        do {
            System.out.println("\n Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. View Library");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    shelf.addBook(genre, new Book(title, author));
                    break;

                case 2:
                    System.out.print("Enter Genre: ");
                    String borrowGenre = sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String borrowTitle = sc.nextLine();

                    shelf.borrowBook(borrowGenre, borrowTitle);
                    break;

                case 3:
                    System.out.print("Enter Genre: ");
                    String returnGenre = sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String returnTitle = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String returnAuthor = sc.nextLine();

                    shelf.returnBook(returnGenre, new Book(returnTitle, returnAuthor));
                    break;

                case 4:
                    shelf.printShelf();
                    break;

                case 5:
                    System.out.println(" Exiting Library System...");
                    break;

                default:
                    System.out.println(" Invalid choice!");
            }

        } while (choice != 5);
    }
}
