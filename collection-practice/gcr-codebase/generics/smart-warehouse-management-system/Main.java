public class Main{
    public static void main(String[] args){
        Storage<Electronics> electronicsStorage = new Storage<>();        // Storage for Electronics
        electronicsStorage.addItem(new Electronics("Laptop", 50000, 2));
        electronicsStorage.addItem(new Electronics("Smartphone", 20000, 1));

        Storage<Groceries> groceriesStorage = new Storage<>();            // Storage for Groceries
        groceriesStorage.addItem(new Groceries("Rice Bag", 1500, "12-12-2025"));
        groceriesStorage.addItem(new Groceries("Milk Packet", 60, "20-01-2026"));

        Storage<Furniture> furnitureStorage = new Storage<>();            // Storage for Furniture
        furnitureStorage.addItem(new Furniture("Chair", 1200, "Wood"));
        furnitureStorage.addItem(new Furniture("Table", 3000, "Steel"));

        WarehouseUtils.displayAllItems(electronicsStorage.getItems());    // Display All Items
        WarehouseUtils.displayAllItems(groceriesStorage.getItems());
        WarehouseUtils.displayAllItems(furnitureStorage.getItems());
    }
}
