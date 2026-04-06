import java.util.*;

public class LongestConsecutiveSequence{
    static int longestConsecutive(int[] arr){
        HashSet<Integer> set = new HashSet<>();    // HashSet to store all elements for O(1) lookup
        for (int num : arr){    // Add all elements to set
            set.add(num);
        }
        int longestStreak = 0;
        for (int num : arr){     // Traverse each element
            if (!set.contains(num - 1)){               // Check if num is the start of a sequence i.e., num - 1 does not exist
                int currentNum = num;
                int currentStreak = 1;
                while(set.contains(currentNum + 1)){    // Count consecutive numbers
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);    // Update longest sequence length
            }
        }
        return longestStreak;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");    // Input array size
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = longestConsecutive(arr);
        System.out.println("Length of Longest Consecutive Sequence: " + result);
    }
}
