import java.util.*;

public class Customer{                     // Represents a customer with a list of items
    String name;
    List<String> items = new ArrayList<>();
    public Customer(String name){
        this.name = name;
    }
    
    public void addItem(String item){      // Add item to customer list
        items.add(item);
    }
}
