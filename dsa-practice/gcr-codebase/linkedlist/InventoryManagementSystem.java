
//  Singly Linked List: Inventory Management System


class ItemNode{        // Node class for Inventory Item
    String itemName;
    int itemId;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(String itemName, int itemId, int quantity, double price){     // constructor
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryList{     // Singly Linked List class
    ItemNode head;

    void addAtBeginning(String name, int id, int qty, double price){     // add item at beginning
        ItemNode newNode = new ItemNode(name, id, qty, price);
        newNode.next = head;
        head = newNode;
    }

    void addAtEnd(String name, int id, int qty, double price){     // add item at end
        ItemNode newNode = new ItemNode(name, id, qty, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void addAtPosition(int position, String name, int id, int qty, double price){     // add item at specific position
        if (position == 1) {
            addAtBeginning(name, id, qty, price);
            return;
        }
        ItemNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
        ItemNode newNode = new ItemNode(name, id, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void removeByItemId(int id){    // remove item by item ID
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }
        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed successfully");
            return;
        }
        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed successfully");
        }
    }

    void updateQuantity(int id, int newQty){     // update quantity by item ID
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    void searchByItemId(int id){   // search by item ID
        ItemNode temp = head;
        while (temp != null){
            if (temp.itemId == id){
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }
    
    void searchByItemName(String name){    // search by item name
        ItemNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }
        if(!found){
            System.out.println("Item not found");
        }
    }
    
    void calculateTotalValue(){    // calculate total inventory value
        ItemNode temp = head;
        double totalValue = 0;
        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + totalValue);
    }
    
    void sortByName(boolean ascending){     // sort by item name (ascending / descending)
        if (head == null) return;
        for (ItemNode i = head; i.next != null; i = i.next) {
            for (ItemNode j = i.next; j != null; j = j.next) {
                int cmp = i.itemName.compareToIgnoreCase(j.itemName);
                if ((ascending && cmp > 0) || (!ascending && cmp < 0)) {
                    swapData(i, j);
                }
            }
        }
    }
    
    void sortByPrice(boolean ascending){     // sort by price (ascending / descending)
        if (head == null) return;
        for (ItemNode i = head; i.next != null; i = i.next){
            for (ItemNode j = i.next; j != null; j = j.next){
                if ((ascending && i.price > j.price) || (!ascending && i.price < j.price)){
                    swapData(i, j);
                }
            }
        }
    }

    void swapData(ItemNode a, ItemNode b){   // helper method to swap node data
        String tempName = a.itemName;
        int tempId = a.itemId;
        int tempQty = a.quantity;
        double tempPrice = a.price;

        a.itemName = b.itemName;
        a.itemId = b.itemId;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemName = tempName;
        b.itemId = tempId;
        b.quantity = tempQty;
        b.price = tempPrice;
    }

    void displayInventory(){    // display all items
        if (head == null){
            System.out.println("No items in inventory");
            return;
        }
        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }
    
    void displayItem(ItemNode item){   // helper method to display item
        System.out.println("-------------------------");
        System.out.println("Item Name : " + item.itemName);
        System.out.println("Item ID   : " + item.itemId);
        System.out.println("Quantity  : " + item.quantity);
        System.out.println("Price     : " + item.price);
    }
}

public class InventoryManagementSystem{     // Main class
    public static void main(String[] args){
        InventoryList inventory = new InventoryList();
        inventory.addAtEnd("Laptop", 101, 5, 55000);
        inventory.addAtEnd("Mouse", 102, 20, 500);
        inventory.addAtBeginning("Keyboard", 103, 10, 1200);
        System.out.println("Inventory List:");
        inventory.displayInventory();
        System.out.println("\nUpdate Quantity:");
        inventory.updateQuantity(102, 30);
        System.out.println("\nSearch by Item Name:");
        inventory.searchByItemName("Laptop");
        System.out.println("\nTotal Inventory Value:");
        inventory.calculateTotalValue();
        System.out.println("\nSort by Name (Ascending):");
        inventory.sortByName(true);
        inventory.displayInventory();
        System.out.println("\nSort by Price (Descending):");
        inventory.sortByPrice(false);
        inventory.displayInventory();
    }
}
