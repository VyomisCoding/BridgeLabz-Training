import java.util.*;

public class BookList{
    private ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book newBook){    // Add book and keep list sorted (Insertion Sort logic)
        books.add(newBook); // add at end
        int i = books.size() - 1;
        
        while(i > 0 && books.get(i - 1).title.compareToIgnoreCase(newBook.title) > 0){   // Insertion Sort (shifting)
            books.set(i, books.get(i - 1));
            i--;
        }
        books.set(i, newBook);
        System.out.println(" Added: " + newBook.title);
    }
    
    public void displayBooks(){      // Display books
        System.out.println("\n Reading List (Sorted):");
        for(Book b : books){
            System.out.println("- " + b.title);
        }
    }
}
