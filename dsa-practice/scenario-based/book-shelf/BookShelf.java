
import java.util.*;

public class BookShelf{
    private HashMap<String,LinkedList<Book>> shelf = new HashMap<>();       // genre -> linkedlist of books
    private HashSet<String> uniqueTitles = new HashSet<>();                 // to avoid duplicates

    public void addBook(String genre,Book book){     // add book to genre shelf
        if(uniqueTitles.contains(book.title.toLowerCase())){
            System.out.println("Duplicate Book Not Added"+book.title);
            return;
        }
        shelf.putIfAbsent(genre,new LinkedList<>());
        shelf.get(genre).add(book);

        uniqueTitles.add(book.title.toLowerCase());
        System.out.println("Added"+book.title+"in"+genre);
    }

    public void borrowBook(String genre, String title){     // Borrow book
        LinkedList<Book> list = shelf.get(genre);
        if(list == null){
            System.out.println("⚠ Genre not found");
            return;
        }
        for(Book b : list){
            if(b.title.equalsIgnoreCase(title)){
                list.remove(b);
                uniqueTitles.remove(title.toLowerCase());
                System.out.println("Borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // Return book
    public void returnBook(String genre, Book book) {
        addBook(genre, book);
    }

    public void printShelf(){     // Print all shelves
        System.out.println("\n Library Catalog:");
        for(String genre : shelf.keySet()){
            System.out.println("Genre: " + genre);
            for(Book b : shelf.get(genre)){
                System.out.println(" - " + b.title + " (" + b.author + ")");
            }
        }
    }
}
