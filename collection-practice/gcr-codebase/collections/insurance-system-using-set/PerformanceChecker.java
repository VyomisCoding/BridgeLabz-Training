import java.util.*;

public class PerformanceChecker{
    public void checkPerformance(){
        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();
        int size = 100000;
        long start = System.nanoTime();                 // ADD performance---------
        for(int i=0;i<size;i++) hs.add(i);
        
        long hashAdd = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < size; i++) lhs.add(i);
        long lhsAdd = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < size; i++) ts.add(i);
        long treeAdd = System.nanoTime() - start;

        System.out.println("\n--- ADD Performance ---");
        System.out.println("HashSet: " + hashAdd);
        System.out.println("LinkedHashSet: " + lhsAdd);
        System.out.println("TreeSet: " + treeAdd);

        start = System.nanoTime();                     // SEARCH performance---------
        hs.contains(size - 1);
        long hashFind = System.nanoTime() - start;

        start = System.nanoTime();
        lhs.contains(size - 1);
        long lhsFind = System.nanoTime() - start;

        start = System.nanoTime();
        ts.contains(size - 1);
        long treeFind = System.nanoTime() - start;

        System.out.println("\n--- SEARCH Performance ---");
        System.out.println("HashSet: " + hashFind);
        System.out.println("LinkedHashSet: " + lhsFind);
        System.out.println("TreeSet: " + treeFind);

        
        start = System.nanoTime();                    // REMOVE performance---------
        hs.remove(size / 2);
        long hashRemove = System.nanoTime() - start;

        start = System.nanoTime();
        lhs.remove(size / 2);
        long lhsRemove = System.nanoTime() - start;

        start = System.nanoTime();
        ts.remove(size / 2);
        long treeRemove = System.nanoTime() - start;

        System.out.println("\n-REMOVE Performance-");
        System.out.println("HashSet: " + hashRemove);
        System.out.println("LinkedHashSet: " + lhsRemove);
        System.out.println("TreeSet: " + treeRemove);
    }
}
