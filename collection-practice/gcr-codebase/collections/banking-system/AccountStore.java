
// This class stores customer accounts and balances

import java.util.*;
public class AccountStore{
    private HashMap<String, Integer> accounts = new HashMap<>();       // HashMap -> accountNumber (String or int) -> balance

    public void addAccount(String accNo, int balance){                 // Add a new account
        accounts.put(accNo, balance);
    }

    public boolean exists(String accNo){                               // Check if account exists
        return accounts.containsKey(accNo);
    }

    public boolean withdraw(String accNo, int amount){                 // Withdraw money from account
        int current = accounts.get(accNo);
        if(current < amount){
            return false;           // insufficient funds
        }
        accounts.put(accNo, current - amount);
        return true;
    }
    
    public HashMap<String, Integer> getAccounts(){                     // Get all accounts (HashMap)
        return accounts;
    }

    public TreeMap<Integer, String> getSortedAccounts(){               // Get accounts sorted by balance using TreeMap
        TreeMap<Integer, String> sorted = new TreeMap<>();
        for(String acc : accounts.keySet()){
            sorted.put(accounts.get(acc), acc);
        }
        return sorted;
    }
}
