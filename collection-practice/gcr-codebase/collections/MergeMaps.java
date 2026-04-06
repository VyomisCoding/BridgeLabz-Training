// Map Interface

import java.util.*;

public class MergeMaps{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        System.out.print("Enter size of Map1: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n1;i++){
            System.out.print("Key: ");
            String key = sc.nextLine();
            System.out.print("Value: ");
            int val = sc.nextInt();
            sc.nextLine();
            map1.put(key, val);
        }
        System.out.print("Enter size of Map2: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n2;i++){
            System.out.print("Key: ");
            String key = sc.nextLine();
            System.out.print("Value: ");
            int val = sc.nextInt();
            sc.nextLine();
            map2.put(key, val);
        }
        Map<String, Integer> result = new HashMap<>(map1);
        for(String key : map2.keySet()){
            result.put(key, result.getOrDefault(key, 0) + map2.get(key));
        }
        System.out.println("Merged Map: " + result);
    }
}
