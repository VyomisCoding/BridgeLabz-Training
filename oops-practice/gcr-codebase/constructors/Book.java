public class Book{
    String title;
    String author;
    double price;
    
    Book(){  // default constructor
        title="Unknown";
        author="Unknown";
        price=0.0;
    }

    Book(String t, String a, double p){  // parameterized constructor
        title=t;
        author=a;
        price=p;
    }

    void display(){
        System.out.println(title+"by" + author + "Rs." + price);
    }
}
