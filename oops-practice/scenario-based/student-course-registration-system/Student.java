import java.util.ArrayList;

class Student extends Person {

    private int studentId;
    private ArrayList<Course> courses;
    private ArrayList<String> grades;
    private static final int MAX_COURSES = 3;

    Student(int studentId, String name, int age) {
        super(name, age);
        this.studentId = studentId;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    // Encapsulation (Getters only)
    public int getStudentId() {
        return studentId;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<String> getGrades() {
        return grades;
    }

    public boolean canEnroll() {
        return courses.size() < MAX_COURSES;
    }
}
