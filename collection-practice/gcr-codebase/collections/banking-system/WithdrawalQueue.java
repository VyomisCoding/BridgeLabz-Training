
// This class manages withdrawal requests using a Queue

import java.util.*;
public class WithdrawalQueue{
    private Queue<String> queue = new LinkedList<>();        // Queue stores accountNumber + amount

    public void addRequest(String accNo, int amount){        // Add request → format: "accNo amount"
        queue.add(accNo + " " + amount);
    }

    public Queue<String> getQueue(){                         // Return queue object
        return queue;
    }
}
