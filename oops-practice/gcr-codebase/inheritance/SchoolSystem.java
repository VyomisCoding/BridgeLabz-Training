
// Heirarchical Inheritance : School System with different roles

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Teacher subclass
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Student subclass
class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student");
        System.out.println("Grade: " + grade);
    }
}

// Staff subclass
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + " is a Staff Member");
        System.out.println("Department: " + department);
    }
}
public class SchoolSystem{
    public static void main(String[] args) {

        Teacher t = new Teacher("Anita", 35, "Maths");
        Student s = new Student("Rahul", 16, "10th");
        Staff st = new Staff("Suresh", 40, "Office");

        t.displayRole();
        System.out.println();

        s.displayRole();
        System.out.println();

        st.displayRole();
    }
    
}
