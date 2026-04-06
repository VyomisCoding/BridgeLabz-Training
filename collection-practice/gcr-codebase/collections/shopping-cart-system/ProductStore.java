
// This class stores all products and their prices

import java.util.*;

public class ProductStore{
    private HashMap<String, Integer> products = new HashMap<>();      // HashMap stores product -> price
    
    public void addProduct(String name, int price){                   // Add products to store
        products.put(name, price);
    }
    
    public HashMap<String, Integer> getProducts(){                    // Get all products in store
        return products;
    }

    public boolean exists(String name){                               // Check if product exists in store
        return products.containsKey(name);
    }

    public int getPrice(String name){                                 // Get price of a product
        return products.get(name);
    }
}
