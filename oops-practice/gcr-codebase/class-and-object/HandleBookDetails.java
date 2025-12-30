import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    void getBookDetails(Scanner sc) {
        System.out.print("Enter Book Title: ");
        title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        author = sc.nextLine();
        System.out.print("Enter Book Price: ");
        price = sc.nextDouble();
        sc.nextLine(); // clear buffer
    }

    void displayBookDetails() {
        System.out.println("\nTitle of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + price);
    }
}

public class HandleBookDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book();
        b1.getBookDetails(sc);
        b1.displayBookDetails();

        Book b2 = new Book();
        b2.getBookDetails(sc);
        b2.displayBookDetails(); 
    } 
}
