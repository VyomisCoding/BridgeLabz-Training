import java.util.*;

class MyHashMap{
    class Node{    // Node class to store key-value pairs
        int key;
        int value;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private int SIZE = 10;       // Size of hash table
    private LinkedList<Node>[] table;

    public MyHashMap(){
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++){    // Initialize each index with an empty LinkedList
            table[i] = new LinkedList<>();
        }
    }
    private int hash(int key){    // Hash function
        return key % SIZE;
    }
    public void put(int key, int value){    // Insert or update key-value pair
        int index = hash(key);
        LinkedList<Node> list = table[index];
        for (Node node : list){    // Check if key already exists
            if (node.key == key){
                node.value = value; // Update value
                return;
            }
        }
        list.add(new Node(key, value));    // Key not found → insert new node
    }
    public Integer get(int key){    // Retrieve value by key
        int index = hash(key);
        LinkedList<Node> list = table[index];
        for (Node node : list){
            if (node.key == key){
                return node.value;
            }
        }
        return null;   // Key not found
    }
    public void remove(int key){    // Remove key-value pair
        int index = hash(key);
        LinkedList<Node> list = table[index];
        for (Node node : list) {
            if (node.key == key) {
                list.remove(node);
                return;
            }
        }
    }
}
public class CustomHashMap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MyHashMap map = new MyHashMap();
        while (true) {
            System.out.println("\n--- HashMap Menu ---");
            System.out.println("1. Insert (Put)");
            System.out.println("2. Get");
            System.out.println("3. Remove");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter key: ");
                    int key = sc.nextInt();
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    map.put(key, value);
                    System.out.println("Inserted successfully");
                    break;

                case 2:
                    System.out.print("Enter key to get value: ");
                    key = sc.nextInt();
                    Integer result = map.get(key);
                    if(result == null){
                        System.out.println("Key not found");
                    }else{
                        System.out.println("Value: " + result);
                    }
                    break;

                case 3:
                    System.out.print("Enter key to remove: ");
                    key = sc.nextInt();
                    map.remove(key);
                    System.out.println("Removed if key existed");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
