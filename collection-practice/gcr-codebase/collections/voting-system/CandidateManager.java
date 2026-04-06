import java.util.*;

public class CandidateManager{                    // This class manages candidates list
    private List<String> candidates = new ArrayList<>();
    
    public void addCandidate(String name){        // Add a new candidate
        candidates.add(name);
    }
    
    public List<String> getCandidates(){          // Return all candidates
        return candidates;
    }
}
