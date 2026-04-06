import java.util.*;
public class SandeepFitnessTracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] pushUps = new int[7];
        int total = 0;
        int activeDays = 0;

        System.out.println("Enter the number of push-ups for 7 days (enter 0 for rest day):");
        for (int i = 0; i < pushUps.length; i++) {
            pushUps[i] = sc.nextInt();
        }
        
        for (int count : pushUps) {
            if (count == 0) {
                continue; // skip rest day
            }
            total += count;
            activeDays++;
        }

        double average = activeDays > 0 ? (double) total / activeDays : 0;
        System.out.println("Total nnumber of Push-ups: " + total);
        System.out.println("Average number of Push-ups: " + average);
	}
}
