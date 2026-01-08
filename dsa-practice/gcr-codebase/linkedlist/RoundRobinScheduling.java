
class Process{    // Node representing a process
    int pid, burstTime, remainingTime;
    Process next;

    Process(int pid, int burstTime){
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.next = null;
    }
}

class RoundRobin{        // Circular Linked List for Round Robin Scheduling
    Process head = null;
    
    void addProcess(int pid, int burstTime){     // add process at end
        Process p = new Process(pid, burstTime);
        if (head == null){
            head = p;
            p.next = head;
            return;
        }
        Process temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = p;
        p.next = head;
    }
    
    void removeProcess(int pid){   // remove process by PID
        Process temp = head, prev = null;
        do {
            if (temp.pid == pid){
                if (temp == head){
                    Process last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                }else{
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }
    
    void schedule(int timeQuantum){   // simulate round robin scheduling
        if (head == null) return;
        int totalWT = 0, totalTAT = 0, time = 0;
        int count = countProcesses();
        Process current = head;
        System.out.println("Round Robin Execution:");
        while (count > 0){
            displayQueue();
            if (current.remainingTime > 0){
                int execTime = Math.min(timeQuantum, current.remainingTime);
                current.remainingTime -= execTime;
                time += execTime;
                if(current.remainingTime == 0){
                    int tat = time;
                    int wt = tat - current.burstTime;
                    totalWT += wt;
                    totalTAT += tat;
                    removeProcess(current.pid);
                    count--;
                }
            }
            current = current.next;
        }
        System.out.println("\nAverage Waiting Time: " + (totalWT / (double) countProcessesOriginal));
        System.out.println("Average Turnaround Time: " + (totalTAT / (double) countProcessesOriginal));
    }
    int countProcessesOriginal = 0;
    int countProcesses(){
        if (head == null) return 0;

        int count = 0;
        Process temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        countProcessesOriginal = count;
        return count;
    }
    
    void displayQueue(){     // display current circular queue
        if (head == null){
            System.out.println("Queue Empty");
            return;
        }
        Process temp = head;
        do {
            System.out.print("[P" + temp.pid + " RT:" + temp.remainingTime + "] ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class RoundRobinScheduling{    // Main class
    public static void main(String[] args){
        RoundRobin rr = new RoundRobin();
        rr.addProcess(1, 10);     // adding processes
        rr.addProcess(2, 5);
        rr.addProcess(3, 8);
        int timeQuantum = 3;
        rr.schedule(timeQuantum);
    }
}
