
// This class manages the shopping cart

import java.util.*;

public class Cart{

    private LinkedHashMap<String, Integer> orderedCart = new LinkedHashMap<>();      // LinkedHashMap → maintains order in which items are added

    public void addItem(String name, int price){                                     // Add item to cart
        if(orderedCart.containsKey(name)){                                          // If item already exists, add quantity meaningfully (but here just increase count)
            orderedCart.put(name, orderedCart.get(name) + price);
        }else{
            orderedCart.put(name, price);
        }
    }

    public LinkedHashMap<String, Integer> getOrderedCart(){     
        return orderedCart;
    }

    public TreeMap<Integer, String> getSortedByPrice(){         // TreeMap → sort by price
        TreeMap<Integer, String> sorted = new TreeMap<>();      // TreeMap sorts keys (price) in ascending order
        for(String item : orderedCart.keySet()){
            sorted.put(orderedCart.get(item), item);
        }
        return sorted;
    }
}
