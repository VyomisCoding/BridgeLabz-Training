import java.util.*;

public class CheckoutQueue{
    private Queue<Customer> queue = new LinkedList<>();                // Queue of customers
    private HashMap<String, Integer> priceMap = new HashMap<>();       // Price map
    private HashMap<String, Integer> stockMap = new HashMap<>();       // Stock map

    public void addItemData(String item, int price, int stock){        // Add price and stock initially
        priceMap.put(item, price);
        stockMap.put(item, stock);
    }
    
    public void addCustomer(Customer c){                                // Add customer to queue
        queue.add(c);
        System.out.println("Customer added: " + c.name);
    }
    
    public void processNextCustomer(){                                  // Process billing
        if(queue.isEmpty()){
            System.out.println("No customers in queue");
            return;
        }
        Customer c = queue.poll();
        System.out.println("\n🧾 Billing for: " + c.name);
        int total = 0;
        for(String item : c.items){
            if(!priceMap.containsKey(item)){
                System.out.println("The" + item + " not found");
                continue;
            }
            int stock = stockMap.get(item);
            if(stock <= 0){
                System.out.println("Out of stock: " + item);
                continue;
            }
            total += priceMap.get(item);
            stockMap.put(item, stock - 1);                  // update stock
        }
        System.out.println("Total Bill: INR" + total);
    }
}
