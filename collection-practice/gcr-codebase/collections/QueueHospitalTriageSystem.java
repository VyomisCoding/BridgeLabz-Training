
// Queue Interface

import java.util.*;

class Patient{
    String name;
    int severity;
    Patient(String n, int s){
        name = n;
        severity = s;
    }
}

public class QueueHospitalTriageSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Max-heap: highest severity first
        PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> b.severity - a.severity);
        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter severity: ");
            int sev = sc.nextInt();
            sc.nextLine();
            pq.add(new Patient(name, sev));
        }
        System.out.println("Treatment Order:");
        while(!pq.isEmpty()){
            Patient p = pq.poll();
            System.out.println(p.name + " (Severity " + p.severity + ")");
        }
    }
}
