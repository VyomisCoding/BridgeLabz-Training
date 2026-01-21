import java.util.List;

public class WarehouseUtils{
    public static void displayAllItems(List<? extends WarehouseItem> list){     // Wildcard: accepts ANY subclass of WarehouseItem
        System.out.println("\n Displaying Items ");
        for (WarehouseItem item : list){
            item.displayDetails();
        }
    }
}
