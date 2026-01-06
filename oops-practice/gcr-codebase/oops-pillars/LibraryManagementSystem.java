
// Reservation interface
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Abstract Library Item
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println(title + " by " + author);
    }
}

// Book
class Book extends LibraryItem {

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {

        LibraryItem item = new Book(1, "Java Basics", "James");
        item.getItemDetails();
        System.out.println("Loan Days: " + item.getLoanDuration());
    }
}
