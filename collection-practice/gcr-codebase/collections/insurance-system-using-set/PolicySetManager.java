import java.time.LocalDate;
import java.util.*;

public class PolicySetManager{ 
    private HashSet<Policy> hashSet = new HashSet<>();                     // 1. HashSet — fastest lookup, doesn't maintain order
    private LinkedHashSet<Policy> linkedHashSet = new LinkedHashSet<>();   // 2. LinkedHashSet — maintains insertion order
    private TreeSet<Policy> treeSet = new TreeSet<>();                     // 3. TreeSet — sorted order based on expiry date
    
    public void addPolicy(Policy p){    // Add policy to all sets
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }

    public Set<Policy> getAllUniquePolicies(){                         // Retrieve all unique policies (HashSet)
        return hashSet;
    }

    public List<Policy> getPoliciesExpiringIn30Days(){                 // Policies expiring in next 30 days
        List<Policy> result = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);
        for(Policy p : treeSet){
            if(!p.getExpiryDate().isBefore(today) && p.getExpiryDate().isBefore(limit.plusDays(1))) {
                result.add(p);
            }
        }
        return result;
    }
    
    public List<Policy> getPoliciesByCoverage(String coverage){        // Policies with a specific coverage type
        List<Policy> result = new ArrayList<>();
        for(Policy p : hashSet){
            if(p.getCoverageType().equalsIgnoreCase(coverage)){
                result.add(p);
            }
        }
        return result;
    }

    public Set<String> detectDuplicatePolicies(List<Policy> inputPolicies){        // Find duplicate policies by policy number
        Set<String> duplicates = new HashSet<>();
        HashSet<String> seen = new HashSet<>();
        for(Policy p : inputPolicies){
            if(!seen.add(p.getPolicyNumber())){
                duplicates.add(p.getPolicyNumber());
            }
        }
        return duplicates;
    }

    public Set<Policy> getInsertionOrderPolicies(){
        return linkedHashSet;
    }

    public Set<Policy> getSortedPolicies(){
        return treeSet;
    }
}
