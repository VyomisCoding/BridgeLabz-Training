
// Set Interface

import java.util.*;

public class SetEquality{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        System.out.print("Enter size of Set1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements for Set1:");
        for (int i=0;i<n1;i++) set1.add(sc.nextInt());
        
        System.out.print("Enter size of Set2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements for Set2:");
        for (int i=0;i<n2;i++) set2.add(sc.nextInt());
        
        System.out.println("Are both sets equal? " + set1.equals(set2));      // equals() → checks if both sets have same elements (order ignored)
    }
}
