import java.util.*;

public class CafeteriaMenuApp{
    
    // Menu items
    static String[] menuItems = { "Idli", "Dosa", "Vada", "Pasta", "Burger", "Sandwich", "Pizza", "Tea", "Coffee", "Juice"};
    
    public static void displayMenu(){   // Method to display menu
        System.out.println("---- Cafeteria Menu ----");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(i + " : " + menuItems[i]);
        }
    }

    public static String getItemByIndex(int index){    // Method to get item by index
        if (index >= 0 && index < menuItems.length){
            return menuItems[index];
        } else {
            return "Invalid item selection";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        displayMenu();

        System.out.print("Enter item index to order: ");
        int choice = sc.nextInt();

        String selectedItem = getItemByIndex(choice);
        System.out.println("You selected: " + selectedItem);
    }
}
