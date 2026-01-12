import java.util.ArrayList;

class ElectionServiceImpl implements ElectionService{
    private ArrayList<Voter> voters = new ArrayList<>();
    private ArrayList<Candidate> candidates = new ArrayList<>();
    private ArrayList<Vote> votes = new ArrayList<>();
    @Override
    public void registerVoter(Voter voter){
        voters.add(voter);
        System.out.println("Voter registered: " + voter.name);
    }
    @Override
    public void addCandidate(Candidate candidate){
        candidates.add(candidate);
        System.out.println("🏷️ Candidate added: " + candidate.name);
    }
    @Override
    public void castVote(Voter voter, Candidate candidate) throws DuplicateVoteException{
        if (voter.hasVoted){
            throw new DuplicateVoteException("Voter has already voted");
        }
        Vote vote = new Vote(voter, candidate);
        votes.add(vote);
        candidate.votes++;
        voter.hasVoted = true;
        System.out.println(" Vote cast successfully by " + voter.name);
    }
    @Override
    public void declareResult(){
        System.out.println("\n Election Results:");
        for (Candidate c : candidates){
            System.out.println(c.name + " → " + c.votes + " votes");
        }
    }
}
