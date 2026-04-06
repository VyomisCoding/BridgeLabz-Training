import java.util.*;

public class ReverseList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            arrayList.add(val);
            linkedList.add(val);
        }
        for(int i=0, j=arrayList.size() - 1; i<j; i++, j--){     // Reverse manually for ArrayList
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(j));
            arrayList.set(j, temp);
        }

        for(int i=0, j=linkedList.size() - 1; i<j; i++, j--){     // Reverse manually for LinkedList
            int temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(j));
            linkedList.set(j, temp);
        }

        System.out.println("Reversed ArrayList: " + arrayList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
