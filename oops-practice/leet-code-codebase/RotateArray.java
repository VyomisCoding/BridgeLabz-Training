import java.util.Scanner;

public class RotateArray{
    public static void rotate(int[] nums, int k){   // Method to rotate array
        int n = nums.length;
        k = k % n;     // Handle cases where k > array size
        int[] temp = new int[k];    // Store last k elements
        for (int i = 0; i < k; i++){
            temp[i] = nums[n - k + i];
        }
        for (int i = n - 1; i >= k; i--){   // Shift remaining elements to the right
            nums[i] = nums[i - k];
        }
        for (int i = 0; i < k; i++){    // Copy temp elements to beginning
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter value of k: ");     // Take rotation value
        int k = sc.nextInt();

        rotate(nums, k);        // Rotate array

        System.out.println("Rotated Array:");    // Print rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
