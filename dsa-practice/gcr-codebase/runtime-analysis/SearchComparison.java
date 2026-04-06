import java.util.*;

public class SearchComparison{
    public static void main(String[] args){
        int[] sizes = {1000, 100000, 1000000};              // Dataset sizes you want to test
        System.out.println("=== Search Performance Comparison ===\n");
        for(int size : sizes){
            System.out.println("Dataset Size: " + size);
            int[] array = generateArray(size);             // Generate dataset
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
            for(int val : array){                      // Insert values into HashSet and TreeSet
                hashSet.add(val);
                treeSet.add(val);
            }
            int target = size - 1;                    // Element to search
            
            long arrayStart = System.currentTimeMillis();         // Array Linear Search ----------------
            boolean foundInArray = linearSearch(array, target);
            long arrayEnd = System.currentTimeMillis();
            System.out.println("Array Search Time (O(N)): " + (arrayEnd - arrayStart) + " ms");
           
            long hashStart = System.currentTimeMillis();          // HashSet Search ----------------
            boolean foundInHash = hashSet.contains(target);
            long hashEnd = System.currentTimeMillis();
            System.out.println("HashSet Search Time (O(1)): " + (hashEnd - hashStart) + " ms");
           
            long treeStart = System.currentTimeMillis();          // TreeSet Search ----------------
            boolean foundInTree = treeSet.contains(target);
            long treeEnd = System.currentTimeMillis();
            System.out.println("TreeSet Search Time (O(log N)): " + (treeEnd - treeStart) + " ms");
            System.out.println("-----------------------------------------\n");
        }
    }
    private static int[] generateArray(int n){            // Generate an array of size N containing sequential values 0..N-1
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
    
    private static boolean linearSearch(int[] arr, int target){    // Linear search in array (O(N))
        for(int num : arr){
            if (num == target){
                return true;
            }
        }
        return false;
    }
}
