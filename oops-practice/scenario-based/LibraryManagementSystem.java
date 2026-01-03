import java.util.*;

public class LibraryManagementSystem{
    //Method to display the books
    static void displayBooks(String[] title,String[] author,boolean[] status){
        for (int i = 0; i < title.length; i++){
            System.out.println(title[i] + " by " + author[i] + " | " + (status[i] ? "Available" : "Checked Out"));
        }
    }

    static void searchBook(String[] title, boolean[] status, String key) {
        boolean found = false;
        for (int i = 0; i < title.length; i++) {
            if (title[i].toLowerCase().contains(key.toLowerCase())) {
                System.out.println(title[i] + " | " + (status[i] ? "Available" : "Checked Out"));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] titles = {"Java Basics", "Python Guide", "Data Structures"};
        String[] authors = {"James", "Ross", "Mark"};
        boolean[] available = {true, true, false};

        displayBooks(titles, authors, available);

        System.out.print("Search book by title: ");
        String key = sc.nextLine();

        searchBook(titles, available, key);
    }
}
