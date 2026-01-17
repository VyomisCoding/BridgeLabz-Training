import java.util.*;

public class FirstLastOccurence{
    public static int firstOccurrence(int[] arr, int target){
        int left = 0, right = arr.length - 1, ans = -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == target){
                ans = mid;
                right = mid - 1;  // go left
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
    public static int lastOccurrence(int[] arr, int target){
        int left = 0, right = arr.length - 1, ans = -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == target){
                ans = mid;
                left = mid + 1;  // go right
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted array values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);
        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}
