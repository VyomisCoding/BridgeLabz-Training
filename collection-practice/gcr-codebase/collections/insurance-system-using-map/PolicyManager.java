
// Manages all policies using Map structures

import java.time.LocalDate;
import java.util.*;

public class PolicyManager{           

    private HashMap<String, Policy> policyMap = new HashMap<>();                           // HashMap -> for fast lookup using policy number

    private LinkedHashMap<String, Policy> policyInsertionOrder = new LinkedHashMap<>();    // LinkedHashMap -> maintains insertion order
    
    private TreeMap<LocalDate, List<Policy>> policyByExpiry = new TreeMap<>();             // TreeMap -> sorted by expiry date (Key = expiry date, Value = List of policies)

    public void addPolicy(Policy p){                                         // Add new policy to all maps

        policyMap.put(p.getPolicyNumber(), p);                               // HashMap
        
        policyInsertionOrder.put(p.getPolicyNumber(), p);                    // LinkedHashMap
        
        policyByExpiry.putIfAbsent(p.getExpiryDate(), new ArrayList<>());    // TreeMap: expiry date sorting
        
        policyByExpiry.get(p.getExpiryDate()).add(p);
    }

    public Policy getPolicyByNumber(String number){       // Retrieve policy by number
        return policyMap.get(number);
    }

    public List<Policy> getPoliciesExpiringIn30Days(){    // List all policies expiring in next 30 days
        List<Policy> result = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate next30 = today.plusDays(30);
        SortedMap<LocalDate, List<Policy>> subMap = policyByExpiry.subMap(today, next30.plusDays(1));   // Get all expiry dates from today to next 30 days
        for(List<Policy> list : subMap.values()){
            result.addAll(list);
        }
        return result;
    }
    
    public List<Policy> getPoliciesByHolder(String holderName){     // List all policies by policyholder name
        List<Policy> result = new ArrayList<>();
        for(Policy p : policyMap.values()){
            if (p.getPolicyHolderName().equalsIgnoreCase(holderName)){
                result.add(p);
            }
        }
        return result;
    }

    public void removeExpiredPolicies(){             // Remove expired policies
        LocalDate today = LocalDate.now();
        Iterator<String> it = policyMap.keySet().iterator();      // Remove from HashMap & LinkedHashMap

        while(it.hasNext()){
            String key = it.next();
            Policy p = policyMap.get(key);
            if(p.getExpiryDate().isBefore(today)){
                it.remove();
                policyInsertionOrder.remove(key);
            }
        }
        policyByExpiry.headMap(today).clear();                   // Remove from TreeMap
    }
    
    public void displayAll(){                                    // Utility methods for display
        System.out.println("\n--- All Policies (Insertion Order - LinkedHashMap) ---");
        for (Policy p : policyInsertionOrder.values()) System.out.println(p);
    }

    public void displaySortedByExpiry(){
        System.out.println("\n--- Policies Sorted by Expiry (TreeMap) ---");
        for (LocalDate date : policyByExpiry.keySet()) {
            for (Policy p : policyByExpiry.get(date)) System.out.println(p);
        }
    }
}
