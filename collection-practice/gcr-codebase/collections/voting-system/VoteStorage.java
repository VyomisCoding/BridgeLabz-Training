import java.util.*;

public class VoteStorage{                // This class stores votes using different Maps
    
    private HashMap<String, Integer> voteMap = new HashMap<>();                       // HashMap → stores candidate -> votes

    private LinkedHashMap<String, Integer> linkedVoteMap = new LinkedHashMap<>();     // LinkedHashMap → maintains order in which candidates got first vote

    public void addVote(String candidate){                                               // Add vote to a candidate
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);     // Update HashMap
        if(!linkedVoteMap.containsKey(candidate)){      // Update LinkedHashMap (preserve insertion order)
            linkedVoteMap.put(candidate, 1);
        }else{
            linkedVoteMap.put(candidate, linkedVoteMap.get(candidate) + 1);
        }
    }
    
    public HashMap<String, Integer> getVoteMap(){        // Get HashMap results
        return voteMap;
    }

    public LinkedHashMap<String, Integer> getLinkedVoteMap(){     // Get LinkedHashMap results
        return linkedVoteMap;
    }

    public TreeMap<String, Integer> getSortedResults(){           // Get sorted result using TreeMap
        return new TreeMap<>(voteMap); // sorts alphabetically
    }
}
