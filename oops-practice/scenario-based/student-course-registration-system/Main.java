public class Main{
    public static void main(String[] args){
        Student student = new Student(101, "Vyomesh", 21);
        Course c1 = new Course(1, "Java");
        Course c2 = new Course(2, "DBMS");
        Course c3 = new Course(3, "CN");
        Course c4 = new Course(4, "OS");
        RegistrationService service = new StudentRegistrationService();
        try {
            service.enroll(student, c1);
            service.enroll(student, c2);
            service.enroll(student, c3);
            service.enroll(student, c4); // Exception here
        } catch (CourseLimitExceededException e) {
            System.out.println("⚠️ " + e.getMessage());
        }
        service.assignGrade(student, "A");
        service.assignGrade(student, "B+");
        System.out.println("\n Enrolled Courses:");
        for (Course c : student.getCourses()) {
            System.out.println("- " + c.courseName);
        }
        System.out.println("\n Grades:");
        for (String g : student.getGrades()) {
            System.out.println("- " + g);
        }
    }
}
