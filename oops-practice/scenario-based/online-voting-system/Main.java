public class Main{
    public static void main(String[] args){
        ElectionService service = new ElectionServiceImpl();

        Voter v1 = new Voter(1, "Rahul");
        Voter v2 = new Voter(2, "Vyomesh");

        Candidate c1 = new Candidate(101, "Candidate A");
        Candidate c2 = new Candidate(102, "Candidate B");

        service.registerVoter(v1);
        service.registerVoter(v2);
        service.addCandidate(c1);
        service.addCandidate(c2);
        try{
            service.castVote(v1, c1);
            service.castVote(v2, c2);
            service.castVote(v1, c2); // Exception
        }catch(DuplicateVoteException e){
            System.out.println("⚠️ " + e.getMessage());
        }
        service.declareResult();
    }
}
