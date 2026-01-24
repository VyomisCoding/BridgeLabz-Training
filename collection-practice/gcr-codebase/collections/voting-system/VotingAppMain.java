import java.util.*;

public class VotingAppMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CandidateManager cm = new CandidateManager();
        VoteStorage vs = new VoteStorage();
        System.out.print("Enter number of candidates: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter candidate names:");
        for(int i=0;i<n;i++){
            cm.addCandidate(sc.nextLine());
        }
        System.out.print("Enter number of votes: ");
        int votes = sc.nextInt();
        sc.nextLine();
        System.out.println("\nVote by typing candidate's name:");     // Voting process
        for(int i=0;i<votes;i++){
            String vote = sc.nextLine();
            if(cm.getCandidates().contains(vote)){       // Check if candidate exists
                vs.addVote(vote);
            }else{
                System.out.println("Invalid candidate! Vote ignored.");
            }
        }
        System.out.println("\n--VOTING RESULTS (HashMap)--");    // Display results
        System.out.println(vs.getVoteMap());
        System.out.println("\n--PRESERVE ORDER (LinkedHashMap)--");
        System.out.println(vs.getLinkedVoteMap());
        System.out.println("\n--SORTED RESULTS (TreeMap - Alphabetical Order)--");
        System.out.println(vs.getSortedResults());
    }
}
