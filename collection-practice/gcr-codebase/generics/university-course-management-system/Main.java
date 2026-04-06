import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Course<ExamCourse> examDept = new Course<>();                // Generic managers for different departments
        Course<AssignmentCourse> assignmentDept = new Course<>();
        Course<ResearchCourse> researchDept = new Course<>();
        while(true){
            System.out.println("\n--- UNIVERSITY COURSE MANAGEMENT ---");
            System.out.println("1. Add Exam-Based Course");
            System.out.println("2. Add Assignment-Based Course");
            System.out.println("3. Add Research-Based Course");
            System.out.println("4. Show All Courses");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // flush
            switch(choice){
                case 1:  // Exam Course
                    System.out.print("Enter Course Name: ");
                    String examName = sc.nextLine();
                    System.out.print("Enter Credits: ");
                    int examCredits = sc.nextInt();
                    System.out.print("Enter Exam Marks: ");
                    int marks = sc.nextInt();
                    examDept.addCourse(new ExamCourse(examName, examCredits, marks));
                    System.out.println("Exam-Based Course Added!");
                    break;
                case 2:  // Assignment Course
                    System.out.print("Enter Course Name: ");
                    String assignName = sc.nextLine();
                    System.out.print("Enter Credits: ");
                    int assignCredits = sc.nextInt();
                    System.out.print("Enter Number of Assignments: ");
                    int numAssign = sc.nextInt();
                    assignmentDept.addCourse(new AssignmentCourse(assignName, assignCredits, numAssign));
                    System.out.println("Assignment-Based Course Added!");
                    break;
                case 3:  // Research Course
                    System.out.print("Enter Course Name: ");
                    String researchName = sc.nextLine();
                    System.out.print("Enter Credits: ");
                    int researchCredits = sc.nextInt();
                    sc.nextLine(); // flush
                    System.out.print("Enter Research Topic: ");
                    String topic = sc.nextLine();
                    researchDept.addCourse(new ResearchCourse(researchName, researchCredits, topic));
                    System.out.println("Research-Based Course Added!");
                    break;
                case 4:  // Show All Courses
                    System.out.println("\n--- ALL EXAM COURSES ---");
                    CourseUtils.displayAllCourses(examDept.getAllCourses());
                    System.out.println("\n--- ALL ASSIGNMENT COURSES ---");
                    CourseUtils.displayAllCourses(assignmentDept.getAllCourses());
                    System.out.println("\n--- ALL RESEARCH COURSES ---");
                    CourseUtils.displayAllCourses(researchDept.getAllCourses());
                    break;
                case 5:
                    System.out.println("Exiting System...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}
