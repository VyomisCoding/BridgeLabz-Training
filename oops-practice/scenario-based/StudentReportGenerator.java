import java.util.*;

class InvalidMarkException extends Exception{    // Custom Exception for invalid marks
    public InvalidMarkException(String message){
        super(message);
    }
}

class Student{    // Class to store student record
    private String name;
    private String[] subjects;
    private int[] marks;

    public Student(String name, String[] subjects, int[] marks)  throws InvalidMarkException{    // constructor
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;

        for (int m : marks){     // Validate marks (0–100)
            if (m < 0 || m > 100){
                throw new InvalidMarkException( "Invalid mark detected: " + m + " (Marks must be 0–100)");
            }
        }
    }

    public double calculateAverage(){    // Method to calculate average marks
        int sum = 0;
        for (int m : marks){
            sum += m;
        }
        return (double) sum / marks.length;
    }

    public String assignGrade(){   // Method to assign grade based on average
        double avg = calculateAverage();
        if (avg >= 80) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 40) return "C";
        else return "F";
    }

    public void displayReport(){    // Method to display formatted report card
        System.out.println("\n-------------------------------");
        System.out.println("Report Card");
        System.out.println("Student Name : " + name);
        System.out.println("-------------------------------");
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-15s : %d%n", subjects[i], marks[i]);
        }
        System.out.println("-------------------------------");
        System.out.printf("Average Marks : %.2f%n", calculateAverage());
        System.out.println("Grade         : " + assignGrade());
        System.out.println("-------------------------------");
    }
}

public class StudentReportGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();     // List to store multiple student records
        try {
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            String[] subjects = {"Maths", "Science", "English"}; // Fixed subjects for all students

            for (int i = 1; i <= n; i++) {
                System.out.println("\nEnter details for Student " + i);
                System.out.print("Name: ");
                String name = sc.nextLine();

                int[] marks = new int[subjects.length];

                for (int j = 0; j < subjects.length; j++){     // Input marks for each subject
                    System.out.print("Enter marks for " + subjects[j] + ": ");
                    marks[j] = sc.nextInt();
                }
                sc.nextLine(); // consume newline

                Student student = new Student(name, subjects, marks);    // Create student object and add to list
                students.add(student);
            }

            for (Student s : students){   // Display report cards
                s.displayReport();
            }
        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
