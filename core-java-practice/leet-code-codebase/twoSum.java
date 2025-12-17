import java.util.HashMap;
import java.util.Map;

class Solution {

    // Function to find two indices whose values add up to target
    public int[] twoSum(int[] nums, int target) {

        // HashMap to store array value and its index
        Map<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {

            // Find the value needed to reach the target
            int complement = target - nums[i];

            // If the required value already exists in map
            if (map.containsKey(complement)) {
                // Return the indices
                return new int[] { map.get(complement), i };
            }

            // Store current value with its index
            map.put(nums[i], i);
        }

        // If no pair is found
        throw new IllegalArgumentException("No two sum solution");
    }

    // Main method for testing
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        // Print the result
        System.out.println("Indices are: " + result[0] + " and " + result[1]);
    }
}
