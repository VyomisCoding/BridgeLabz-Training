import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Product<?>> catalog = new ArrayList<>();
        while(true){
            System.out.println("\n--- ONLINE MARKETPLACE ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add Clothing");
            System.out.println("3. Add Gadget");
            System.out.println("4. Apply Discount to All");
            System.out.println("5. Show Catalog");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();  // flush
            if(ch == 1){
                System.out.print("Enter Book Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                Product<BookCategory> p = new Product<>(name, price, new BookCategory());
                catalog.add(p);
                System.out.println("Book Added Successfully!");
            }else if(ch == 2){
                System.out.print("Enter Clothing Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                Product<ClothingCategory> p = new Product<>(name, price, new ClothingCategory());
                catalog.add(p);
                System.out.println("Clothing Added Successfully!");
            }else if(ch == 3){
                System.out.print("Enter Gadget Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                Product<GadgetCategory> p = new Product<>(name, price, new GadgetCategory());
                catalog.add(p);
                System.out.println("Gadget Added Successfully!");
            }else if(ch == 4){
                System.out.print("Enter Discount Percentage: ");
                double percent = sc.nextDouble();
                for(Product<?> prod : catalog){
                    DiscountUtil.applyDiscount(prod, percent);
                }
            }else if(ch == 5){
                System.out.println("\n--- PRODUCT CATALOG ---");
                for (Product<?> p : catalog) {
                    p.display();
                }
            }else if (ch == 6){
                System.out.println("Exiting...");
                break;
            }else{
                System.out.println("Invalid Choice!");
            }
        }
    }
}
