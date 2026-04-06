
//   Singly Linked List: Student Record Management

import java.util.*;

class StudentNode {
    int rollNo;
    String name;
    int age;
    char grade;
    StudentNode next;

    StudentNode(int rollNo, String name, int age, char grade){    // constructor to create a new student node
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    StudentNode head;

    void addAtBeginning(int rollNo, String name, int age, char grade){    // add student at beginning
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    void addAtEnd(int rollNo, String name, int age, char grade){          // add student at end
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        if (head == null){
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void addAtPosition(int position, int rollNo, String name, int age, char grade){     // add student at specific position
        if (position == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        StudentNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteByRollNo(int rollNo){     // delete student by roll number
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student deleted successfully");
            return;
        }
        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted successfully");
        }
    }

    void searchByRollNo(int rollNo){      // search student by roll number
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                System.out.println("Roll No: " + temp.rollNo);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    void updateGrade(int rollNo, char newGrade){     // update student grade by roll number
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    void displayStudents(){    // display all student records
        if (head == null) {
            System.out.println("No student records available");
            return;
        }
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("-----------------------");
            System.out.println("Roll No: " + temp.rollNo);
            System.out.println("Name: " + temp.name);
            System.out.println("Age: " + temp.age);
            System.out.println("Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();
        while (true) {
            System.out.println("\n1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Roll No");
            System.out.println("5. Search by Roll No");
            System.out.println("6. Update Grade");
            System.out.println("7. Display All");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    list.addAtBeginning(1, "Amit", 20, 'A');
                    break;
                case 2:
                    list.addAtEnd(2, "Riya", 21, 'B');
                    break;
                case 3:
                    list.addAtPosition(2, 3, "Karan", 22, 'A');
                    break;
                case 4:
                    list.deleteByRollNo(2);
                    break;
                case 5:
                    list.searchByRollNo(1);
                    break;
                case 6:
                    list.updateGrade(1, 'A');
                    break;
                case 7:
                    list.displayStudents();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
