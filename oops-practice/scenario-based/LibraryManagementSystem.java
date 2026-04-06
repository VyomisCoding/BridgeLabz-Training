import java.util.*;

// Custom Exception when book is not available
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

// Book class to store book details
class Book {
    String title;
    String author;
    boolean available;

    // Constructor
    Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }
}

public class LibraryManagementSystem {

    // Method to display all books
    static void displayBooks(List<Book> books) {
        for (Book b : books) {
            System.out.println(
                b.title + " by " + b.author + " | " +
                (b.available ? "Available" : "Checked Out")
            );
        }
    }

    // Method to search books by partial title
    static void searchBook(List<Book> books, String key) {
        boolean found = false;

        for (Book b : books) {
            if (b.title.toLowerCase().contains(key.toLowerCase())) {
                System.out.println(
                    b.title + " | " +
                    (b.available ? "Available" : "Checked Out")
                );
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    // Method to checkout a book
    static void checkoutBook(List<Book> books, String title)
            throws BookNotAvailableException {

        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.available) {
                    throw new BookNotAvailableException(
                        "Book \"" + title + "\" is already checked out"
                    );
                }
                b.available = false;
                System.out.println("Book checked out successfully.");
                return;
            }
        }
        System.out.println("Book not found in library.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Book data stored in Array (as required)
        Book[] bookArray = {
            new Book("Java Basics", "James", true),
            new Book("Python Guide", "Ross", true),
            new Book("Data Structures", "Mark", false)
        };

        // Store book details in List
        List<Book> books = new ArrayList<>();
        books.addAll(Arrays.asList(bookArray));

        try {
            // Display all books
            displayBooks(books);

            // Search book
            System.out.print("\nSearch book by title: ");
            String key = sc.nextLine();
            searchBook(books, key);

            // Checkout book
            System.out.print("\nEnter exact book title to checkout: ");
            String title = sc.nextLine();
            checkoutBook(books, title);

            // Display updated book list
            System.out.println("\nUpdated Book List:");
            displayBooks(books);

        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
