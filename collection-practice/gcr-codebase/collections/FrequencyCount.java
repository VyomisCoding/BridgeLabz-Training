import java.util.*;

public class FrequencyCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();                      // consume leftover newline
        System.out.println("Enter strings:");
        for(int i=0;i<n;i++){
            list.add(sc.nextLine());
        }
        Map<String, Integer> freqMap = new HashMap<>();           // Map to store frequency
        for(String item : list){
            // getOrDefault → returns value if exists, else default 0
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }
        System.out.println("Frequency Map: " + freqMap);
    }
}
