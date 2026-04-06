import java.util.*;
public class PoolBoothSystem {
	private static void showCandidates(){
		System.out.println("Choose your candidates");
		System.out.println("1. Candidate A");
		System.out.println("2. Candidate B");
		System.out.println("3. Candidate C");
        System.out.print("Enter the option (1/2/3): ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int votesA = 0, votesB = 0, votesC = 0;
        int voterCount = 1;
        
        System.out.println("=== Election Booth Started ===");
        System.out.println("Enter -999 anytime to stop voting.\n");
        
        while (true) {

            System.out.print("Voter " + voterCount + " → Enter your age: ");
            int age = sc.nextInt();

            // exit condition
            if (age == -999) {
                break;
            }

            if (age < 18) {
                System.out.println("Not eligible to vote.\n");
                continue;  
            }

            // eligible voter
            showCandidates();
            int choice = sc.nextInt();

            if (choice == -999) {
                break;
            }
            switch (choice) {
            case 1:
                votesA++;
                System.out.println("Your vote has been recorded for Candidate A.\n");
                break;

            case 2:
                votesB++;
                System.out.println("Your vote has been recorded for Candidate B.\n");
                break;

            case 3:
                votesC++;
                System.out.println("Your vote has been recorded for Candidate C.\n");
                break;

            default:
                System.out.println("Invalid option! Vote not recorded.\n");
        }

        voterCount++;
    }
    System.out.println("\n=== Voting Session Ended ===");
    System.out.println("Total votes for Candidate A: " + votesA);
    System.out.println("Total votes for Candidate B: " + votesB);
    System.out.println("Total votes for Candidate C: " + votesC);
	}
}
