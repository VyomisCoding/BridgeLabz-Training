// Map Interface

import java.util.*;

public class InvertMap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Enter key: ");
            String key = sc.nextLine();
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            sc.nextLine();
            map.put(key, value);
        }
        Map<Integer, List<String>> inverted = new HashMap<>();
        for(String key : map.keySet()){
            int value = map.get(key);
            inverted.putIfAbsent(value, new ArrayList<>());
            inverted.get(value).add(key);
        }
        System.out.println("Inverted Map: " + inverted);
    }
}
