public class Main {
    public static void main(String[] args) {
        BookList readingList = new BookList();
        readingList.addBook(new Book("Java Programming"));
        readingList.addBook(new Book("Algorithms"));
        readingList.addBook(new Book("Data Structures"));
        readingList.addBook(new Book("Artificial Intelligence"));
        readingList.displayBooks();
    }
}
