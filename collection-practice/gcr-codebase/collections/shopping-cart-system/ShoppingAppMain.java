import java.util.*;

public class ShoppingAppMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ProductStore store = new ProductStore();
        Cart cart = new Cart();
        System.out.print("Enter number of products to add in store: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter product name and price:");    // Adding products to the store
        for(int i=0;i<n;i++){
            System.out.print("Product name: ");
            String name = sc.nextLine();
            System.out.print("Product price: ");
            int price = sc.nextInt();
            sc.nextLine();
            store.addProduct(name, price);
        }
        System.out.print("\nEnter number of items to add into cart: ");
        int m = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter item name to add to cart:");    // Adding items to cart
        for(int i=0;i<m;i++){
            String item = sc.nextLine();
            if(store.exists(item)){
                cart.addItem(item, store.getPrice(item));
            }else{
                System.out.println("Item not found in store! Skipping...");
            }
        }
        System.out.println("\n--ORDER OF ITEMS ADDED (LinkedHashMap)--");
        System.out.println(cart.getOrderedCart());
        System.out.println("\n--STORE PRODUCTS (HashMap)--");
        System.out.println(store.getProducts());
        System.out.println("\n--ITEMS SORTED BY PRICE (TreeMap)--");
        System.out.println(cart.getSortedByPrice());
    }
}
