
// Single Inheritance : Library Management with Books and Authors

class Book{
    String title;
    int publicationYear;
    Book(String title, int year){ // Constructor to initialize book details
        this.title = title;
        this.publicationYear = year;
    }

    void displayInfo(){  // Method to display book information
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book{  // subclass Author extends Book
    String name;
    String bio;

    Author(String title, int year, String name, String bio){    // Constructor using super to call Book constructor
        super(title, year);       
        this.name = name;
        this.bio = bio;
    }

    void displayInfo(){  // Overriding displayInfo to add author details
        super.displayInfo();   // display book info
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}


public class LibraryManagement{
    public static void main(String[] args){
        // Creating Author object (also contains Book data)
        Author book1 = new Author(  
                "Java Fundamentals",
                2022,
                "James Gosling",
                "Creator of Java Programming Language"
        ); 
        book1.displayInfo();
    }
}
