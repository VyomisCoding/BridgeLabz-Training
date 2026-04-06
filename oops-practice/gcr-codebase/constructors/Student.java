public class Student{
    public int rollNumber;
    public String name;
    private double cgpa;

    void setCgpa(double c){
        cgpa = c;
    }

    double getCGPA() {
        return cgpa;
    }
}

class PostgraduateStudent extends Student {
    void display() {
        System.out.println(rollNumber + " - " + name);
    }
    
}
