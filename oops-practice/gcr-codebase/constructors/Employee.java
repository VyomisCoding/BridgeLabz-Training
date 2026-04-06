public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    void setSalary(double s) {
        salary = s;
    }

    double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    void display() {
        System.out.println(employeeID + " - " + department);
    }
}
