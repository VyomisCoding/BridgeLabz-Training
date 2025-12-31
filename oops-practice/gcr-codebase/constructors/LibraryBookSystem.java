public class LibraryBookSystem{
    String title;
    String author;
    double price;
    boolean available = true;

    LibraryBookSystem(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }
}
