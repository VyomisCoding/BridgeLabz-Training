
// Circular Linked :: Task Scheduling System

class TaskNode{    // Node class for Circular Linked List
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskId, String taskName, int priority, String dueDate){    // constructor
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskCircularList{     // Circular Linked List class
    TaskNode head = null;
    TaskNode current = null;     // used for task scheduling

    void addAtBeginning(int id, String name, int priority, String dueDate){     // add task at beginning
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    void addAtEnd(int id, String name, int priority, String dueDate){      // add task at end
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }
    
    void addAtPosition(int position, int id, String name, int priority, String dueDate){    // add task at specific position
        if (position == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }
        TaskNode temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void removeByTaskId(int id){      // remove task by task ID
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }
        TaskNode temp = head;
        TaskNode prev = null;

        do {
            if (temp.taskId == id) {
                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task removed successfully");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Task not found");
    }

    void viewNextTask(){      // view current task and move to next
        if (current == null){
            System.out.println("No tasks scheduled");
            return;
        }
        System.out.println("Current Task:");
        displayTask(current);
        current = current.next;
    }

    void displayAllTasks(){     // display all tasks
        if (head == null) {
            System.out.println("No tasks to display");
            return;
        }
        TaskNode temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByPriority(int priority){      // search task by priority
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }
        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No tasks found with this priority");
        }
    }

    void displayTask(TaskNode task){     // helper method to print task details
        System.out.println("------------------------");
        System.out.println("Task ID   : " + task.taskId);
        System.out.println("Task Name : " + task.taskName);
        System.out.println("Priority  : " + task.priority);
        System.out.println("Due Date  : " + task.dueDate);
    }
}

public class TaskScheduler{     // Main class
    public static void main(String[] args) {
        TaskCircularList scheduler = new TaskCircularList();
        
        scheduler.addAtEnd(1, "Database Backup", 1, "10-01-2026");          // adding tasks
        scheduler.addAtEnd(2, "Code Review", 2, "12-01-2026");
        scheduler.addAtBeginning(3, "Server Maintenance", 1, "08-01-2026");
        System.out.println("All Tasks:");
        scheduler.displayAllTasks();
        System.out.println("\nView Next Task:");
        scheduler.viewNextTask();
        scheduler.viewNextTask();
        System.out.println("\nSearch by Priority:");
        scheduler.searchByPriority(1);
        System.out.println("\nRemove Task:");
        scheduler.removeByTaskId(2);
        System.out.println("\nFinal Task List:");
        scheduler.displayAllTasks();
    }
}
