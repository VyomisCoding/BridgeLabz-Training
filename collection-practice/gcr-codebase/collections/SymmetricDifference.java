
// Set Interface

import java.util.*;

public class SymmetricDifference{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        System.out.print("Enter size of Set1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Set1 elements:");
        for(int i=0;i<n1;i++) set1.add(sc.nextInt());
        
        System.out.print("Enter size of Set2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter Set2 elements:");
        for(int i=0;i<n2;i++) set2.add(sc.nextInt());

        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2); // A ∪ B

        Set<Integer> inter = new HashSet<>(set1);
        inter.retainAll(set2); // A ∩ B

        result.removeAll(inter); // (A ∪ B) - (A ∩ B)

        System.out.println("Symmetric Difference: " + result);
    }
}
