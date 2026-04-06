public class Book {

    // static variable (shared by all books)
    static String libraryName = "Egmore Library";

    // instance variables
    String title;
    String author;
    final String isbn;   // final so it cannot be changed

    // constructor using 'this'
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // static method
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // method to display book details
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {

        // creating object
        Book book1 = new Book(
                "Effective Java",
                "Joshua Bloch",
                "978-0134685991"
        );

        // display library name
        Book.displayLibraryName();

        // instanceof check before displaying details
        if (book1 instanceof Book) {
            book1.displayBookDetails();
        } else {
            System.out.println("Object is not a Book");
        }
    }

}
