// Doubly Linked List: Movie Management System

class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next;
    MovieNode prev;

    MovieNode(String title, String director, int year, double rating){   // constructor
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieDoublyLinkedList{    // Doubly Linked List class
    MovieNode head;
    MovieNode tail;

    void addAtBeginning(String title, String director, int year, double rating){   // add movie at beginning
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addAtEnd(String title, String director, int year, double rating){   // add movie at end
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void addAtPosition(int position, String title, String director, int year, double rating){   // add movie at specific position
        if (position == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        MovieNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }
        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    void removeByTitle(String title){    // remove movie by title
        if (head == null) {
            System.out.println("No movies available");
            return;
        }
        MovieNode temp = head;
        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Movie not found");
            return;
        }
        if (temp == head){   
            head = head.next;
            if (head != null)
                head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        System.out.println("Movie removed successfully");
    }
    
    void searchByDirector(String director){   // search movie by director
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found for this director");
        }
    }

    void searchByRating(double rating){    // search movie by rating
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found with this rating");
        }
    }

    void updateRating(String title, double newRating){    // update movie rating by title
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    void displayForward(){      // display movies forward
        if (head == null) {
            System.out.println("No movies to display");
            return;
        }
        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }
    
    void displayReverse(){     // display movies in reverse order
        if (tail == null){
            System.out.println("No movies to display");
            return;
        }
        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }
    
    void displayMovie(MovieNode movie){      // helper method to print movie details
        System.out.println("-----------------------");
        System.out.println("Title   : " + movie.title);
        System.out.println("Director: " + movie.director);
        System.out.println("Year    : " + movie.year);
        System.out.println("Rating  : " + movie.rating);
    }
}

public class MovieManagementSystem{     // Main class
    public static void main(String[] args){
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        list.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);    // sample operations
        list.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        list.addAtPosition(2, "Avatar", "James Cameron", 2009, 7.9);
        System.out.println("Movies (Forward):");
        list.displayForward();
        System.out.println("\nMovies (Reverse):");
        list.displayReverse();
        System.out.println("\nSearch by Director:");
        list.searchByDirector("Christopher Nolan");
        System.out.println("\nUpdate Rating:");
        list.updateRating("Avatar", 8.1);
        System.out.println("\nRemove Movie:");
        list.removeByTitle("Inception");
        System.out.println("\nFinal Movie List:");
        list.displayForward();
    }
}