import java.util.*;

class InvalidBackupPathException extends Exception{    // custom exception
    public InvalidBackupPathException(String msg){
        super(msg);
    }
}

class BackupTask implements Comparable<BackupTask>{   // BACKUP TASK CLASS Comparable → higher priority executes first
    String path;
    int priority;                                     // higher number = higher priority
    public BackupTask(String path, int priority){
        this.path = path;
        this.priority = priority;
    }
    @Override
    public int compareTo(BackupTask other){
        return Integer.compare(other.priority, this.priority);     // DESCENDING order
    }
}

class BackupScheduler{                                           // SCHEDULER CLASS ----------------
    PriorityQueue<BackupTask> queue = new PriorityQueue<>();
    public void scheduleBackup(String path, int priority) throws InvalidBackupPathException{  // Add task
        if (!path.startsWith("/")){   // basic validation
            throw new InvalidBackupPathException("Path must start with '/' ");
        }
        queue.add(new BackupTask(path, priority));
        System.out.println("Backup scheduled!");
    }
    public void executeBackup(){               // Execute highest priority task
        if(queue.isEmpty()){
            System.out.println("No pending backup tasks");
            return;
        }
        BackupTask task = queue.poll();
        System.out.println("Executing backup for: " + task.path + " (Priority: " + task.priority + ")");
    }
}

public class BackupSystemMain{                       // MAIN CLASS ----------------
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BackupScheduler scheduler = new BackupScheduler();
        int choice;
        do{
            System.out.println("\n===== Backup Scheduler Menu =====");
            System.out.println("1. Schedule Backup");
            System.out.println("2. Execute Next Backup");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter file path: ");
                    String path = sc.nextLine();
                    System.out.print("Priority (1-10): ");
                    int p = sc.nextInt();
                    sc.nextLine();
                    try{
                        scheduler.scheduleBackup(path, p);
                    }catch(InvalidBackupPathException e){
                        System.out.println("No" + e.getMessage());
                    }
                    break;
                case 2:
                    scheduler.executeBackup();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
            }
        }while(choice != 3);
    }
}
