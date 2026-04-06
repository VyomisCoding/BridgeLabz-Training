import java.util.*;

public class RotateList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.print("Enter rotation count: ");
        int k = sc.nextInt();
        k = k % n;                                      // Avoid large rotations
        List<Integer> rotated = new ArrayList<>();      // Create a new list for rotated result
        for (int i=k;i<n;i++){        // Add elements from k to end
            rotated.add(list.get(i));
        }
        for(int i=0;i<k;i++){         // Add elements from start to k-1
            rotated.add(list.get(i));
        }
        System.out.println("Rotated List: " + rotated);
    }
}
