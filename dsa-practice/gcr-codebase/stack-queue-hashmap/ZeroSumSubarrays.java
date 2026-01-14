import java.util.*;

public class ZeroSumSubarrays{
    public static void findZeroSumSubarrays(int[] arr){
        HashMap<Integer, List<Integer>> map = new HashMap<>();    // HashMap to store prefix sum and list of indices
        int sum = 0;
        // Initialize map with sum = 0 at index -1 , This handles subarrays starting from index 0
        map.put(0, new ArrayList<>(Arrays.asList(-1)));
        System.out.println("Zero Sum Subarrays (startIndex, endIndex):");
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];    // Update prefix sum
            if (map.containsKey(sum)){    // If prefix sum already exists
                // For every previous index with same sum,subarray between (prevIndex+1) to i has sum 0
                for (int prevIndex : map.get(sum)){
                    System.out.println("(" + (prevIndex + 1) + ", " + i + ")");
                }
            }
            map.putIfAbsent(sum, new ArrayList<>());    // Add current index to map
            map.get(sum).add(i);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        findZeroSumSubarrays(arr);
    }
}
