
class BookNode{   // Node class for Doubly Linked List
    String title , author , genre;
    int bookId;
    boolean isAvailable;
    BookNode next , prev;

    BookNode(String title, String author, String genre, int bookId, boolean isAvailable){  // constructor
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

class LibraryDoublyLinkedList{  // Doubly Linked List class
    BookNode head , tail;
    
    void addAtBeginning(String title, String author, String genre, int id, boolean status){   // add book at beginning
        BookNode newNode = new BookNode(title, author, genre, id, status);
        if (head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    
    void addAtEnd(String title, String author, String genre, int id, boolean status){    // add book at end
        BookNode newNode = new BookNode(title, author, genre, id, status);
        if (tail == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    void addAtPosition(int position, String title, String author, String genre, int id, boolean status){   // add book at specific position
        if(position == 1){
            addAtBeginning(title, author, genre, id, status);
            return;
        }
        BookNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++){
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addAtEnd(title, author, genre, id, status);
            return;
        }
        BookNode newNode = new BookNode(title, author, genre, id, status);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }
    
    void removeByBookId(int id){   // remove book by book ID
        if(head == null){
            System.out.println("Library is empty");
            return;
        }
        BookNode temp = head;
        while (temp != null && temp.bookId != id){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Book not found");
            return;
        }
        if(temp == head){
            head = head.next;
            if (head != null)
                head.prev = null;
        }else if(temp == tail){
            tail = tail.prev;
            tail.next = null;
        }else{
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        System.out.println("Book removed successfully");
    }
    
    void searchByTitle(String title){   // search book by title
        BookNode temp = head;
        boolean found = false;
        while (temp != null){
            if (temp.title.equalsIgnoreCase(title)){
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if(!found){
            System.out.println("Book not found");
        }
    }
    
    void searchByAuthor(String author){    // search book by author
        BookNode temp = head;
        boolean found = false;
        while (temp != null){
            if (temp.author.equalsIgnoreCase(author)){
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if(!found){
            System.out.println("No books found for this author");
        }
    }

    void updateAvailability(int id, boolean status){   // update availability status
        BookNode temp = head;
        while (temp != null){
            if (temp.bookId == id){
                temp.isAvailable = status;
                System.out.println("Availability updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }
    
    void displayForward(){       // display books in forward order
        if (head == null){
            System.out.println("No books available");
            return;
        }
        BookNode temp = head;
        while(temp != null){
            displayBook(temp);
            temp = temp.next;
        }
    }
    
    void displayReverse(){    // display books in reverse order
        if (tail == null){
            System.out.println("No books available");
            return;
        }
        BookNode temp = tail;
        while(temp != null){
            displayBook(temp);
            temp = temp.prev;
        }
    }
    
    int countBooks(){   // count total books
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    void displayBook(BookNode book){     // helper method to display book details
        System.out.println("-------------------------");
        System.out.println("Book ID    : " + book.bookId);
        System.out.println("Title      : " + book.title);
        System.out.println("Author     : " + book.author);
        System.out.println("Genre      : " + book.genre);
        System.out.println("Available  : " + (book.isAvailable ? "Yes" : "No"));
    }
}

public class LibraryManagementSystem{      // Main class
    public static void main(String[] args){
        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();
        library.addAtEnd("Java Programming", "James Gosling", "Education", 101, true);
        library.addAtBeginning("Clean Code", "Robert Martin", "Programming", 102, true);
        library.addAtPosition(2, "The Alchemist", "Paulo Coelho", "Fiction", 103, false);
        System.out.println("Library Books (Forward):");
        library.displayForward();
        System.out.println("\nLibrary Books (Reverse):");
        library.displayReverse();
        System.out.println("\nSearch by Author:");
        library.searchByAuthor("Robert Martin");
        System.out.println("\nUpdate Availability:");
        library.updateAvailability(103, true);
        System.out.println("\nRemove Book:");
        library.removeByBookId(101);
        System.out.println("\nTotal Books in Library: " + library.countBooks());
        System.out.println("\nFinal Library List:");
        library.displayForward();
    }
}
