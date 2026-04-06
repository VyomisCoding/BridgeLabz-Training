// Map Interface

import java.util.*;

public class MaxValueKey{
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
            int val = sc.nextInt();
            sc.nextLine();
            map.put(key, val);
        }
        String maxKey = null;
        int maxVal = Integer.MIN_VALUE;
        for(String key : map.keySet()){
            if(map.get(key) > maxVal){
                maxVal = map.get(key);
                maxKey = key;
            }
        }
        System.out.println("Key with highest value: " + maxKey);
    }
}
