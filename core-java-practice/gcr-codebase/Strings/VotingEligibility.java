import java.util.*;
public class VotingEligibility {
	
    public static int[] generateAges(int n, Scanner sc){// Method to generate age array
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }
    
    public static String[][] checkVoting(int[] ages) {// Method for checking voting eligibility
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }
    
    public static void display(String[][] data) {// Method for displaying result
        System.out.println("\nAge\tCan Vote");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ages = generateAges(10, sc);
        String[][] result = checkVoting(ages);
        display(result);
	}
}
