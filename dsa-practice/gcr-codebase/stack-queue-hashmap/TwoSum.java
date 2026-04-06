import java.util.*;

public class TwoSum{
    static int[] twoSum(int[] arr, int target){             // Function to return indices of two numbers
        HashMap<Integer, Integer> map = new HashMap<>();    // HashMap to store element value and its index
        for(int i = 0; i < arr.length; i++){
            int required = target - arr[i];
            if (map.containsKey(required)){   // If complement exists, return indices
                return new int[] { map.get(required), i };
            }
            map.put(arr[i], i);   // Store current element with its index
        }
        return new int[] { -1, -1 };      // No pair found (as per problem, this case may not occur)
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        int[] result = twoSum(arr, target);    // Get result
        if(result[0] == -1){
            System.out.println("No valid pair found");
        }else{
            System.out.println("Indices: " + result[0] + " and " + result[1]);
            System.out.println(
                "Values: " + arr[result[0]] + " + " + arr[result[1]] + " = " + target
            );
        }
    }
}
