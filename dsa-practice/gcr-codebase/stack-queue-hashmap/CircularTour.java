import java.util.*;

public class CircularTour {
    static int findStartingPoint(int[] petrol, int[] distance, int n){
        Queue<Integer> q = new LinkedList<>();
        int start = 0;          // potential starting index
        int currentPetrol = 0;  // petrol balance
        int count = 0;          // number of pumps visited
        while (start < n){
            while (count < n){      // Try to complete the tour from current start
                int idx = (start + count) % n;
                currentPetrol += petrol[idx] - distance[idx];    // Add petrol gained at current pump
                if (currentPetrol < 0){   // If petrol becomes negative, tour fails
                    break;
                }
                q.add(idx);
                count++;
            }
            if(count == n){   // If all pumps are covered, return starting index
                return start;
            }
            q.clear();    // Otherwise, reset and try next starting pump
            start = start + count + 1;
            count = 0;
            currentPetrol = 0;
        }
        return -1;    // If no valid starting point found
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of petrol pumps: ");     // Input number of petrol pumps
        int n = sc.nextInt();
        int[] petrol = new int[n];
        int[] distance = new int[n];
        System.out.println("Enter petrol at each pump:");
        for (int i = 0; i < n; i++){
            petrol[i] = sc.nextInt();
        }
        System.out.println("Enter distance to next pump:");
        for (int i = 0; i < n; i++){
            distance[i] = sc.nextInt();
        }
        int result = findStartingPoint(petrol, distance, n);
        if (result == -1){
            System.out.println("No possible circular tour");
        } else {
            System.out.println("Start at petrol pump index: " + result);
        }
    }
}
