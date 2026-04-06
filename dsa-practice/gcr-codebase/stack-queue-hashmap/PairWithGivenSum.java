import java.util.*;

public class PairWithGivenSum{
    static boolean hasPairWithSum(int[] arr, int target){      // Function to check if pair exists
        HashMap<Integer, Integer> map = new HashMap<>();       // HashMap to store visited elements
        for (int i = 0; i < arr.length; i++){
            int required = target - arr[i];
            if (map.containsKey(required)){      // Check if required element already exists
                System.out.println("Pair found: (" + required + ", " + arr[i] + ")");
                return true;
            }
            map.put(arr[i], i);     // Store current element in map
        }
        return false;    // No pair found
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
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        boolean result = hasPairWithSum(arr, target);
        if(!result){
            System.out.println("No pair exists with given sum");
        }
    }
}
