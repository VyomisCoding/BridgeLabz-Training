import java.util.Scanner;

class Student {
    String name;
    String rollNumber;
    double mark1, mark2, mark3;

    void getDetails(Scanner sc) {
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextLine();

        System.out.print("Enter Mark1: ");
        mark1 = sc.nextDouble();

        System.out.print("Enter Mark2: ");
        mark2 = sc.nextDouble();

        System.out.print("Enter Mark3: ");
        mark3 = sc.nextDouble();
        sc.nextLine(); // buffer clear
    }
    char calculateGrade() {
        double avg = (mark1 + mark2 + mark3) / 3;

        if (avg >= 80)
            return 'A';
        else if (avg >= 70)
            return 'B';
        else if (avg >= 60)
            return 'C';
        else
            return 'D';
    }

    void displayResult() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
        System.out.println("Grade " + calculateGrade());
    }
}

public class SimulateStudentReport{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.getDetails(sc);
        s1.displayResult();

        Student s2 = new Student();
        s2.getDetails(sc);
        s2.displayResult();
    }
}
