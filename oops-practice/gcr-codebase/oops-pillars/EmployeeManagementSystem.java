import java.util.ArrayList;

interface Department{     // interface for Department related work
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee implements Department{   // abstract Employee class
    private int employeeId;     // Encapsulated fields (private)
    private String name;
    private double baseSalary;

    protected String department;     // accessible to child classes

    //Constructor
    public Employee(int employeeId,String name, double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract double calculateSalary();

    // concrete method

    public void displayDetails(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department : " + department);
        System.out.println("Final Salary: " + calculateSalary());
    }

    // Getters and Setters(Encapsulation)
    public int getEmployeeid() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Department interface methods
    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// Full Time Employee class
class FullTimeEmployee extends Employee {
    private double benefits;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}

// Part Time Employee class
class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, int hoursWorked, double hourlyRate) {
        super(employeeId, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Salary based on hours worked
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeeManagementSystem{
    public static void main(String[] args){

        // Polymorphism: Employee reference
        ArrayList<Employee> employees = new ArrayList<>();

        Employee emp1 = new FullTimeEmployee(101, "Amit Sharma", 50000);
        emp1.assignDepartment("HR");

        Employee emp2 = new PartTimeEmployee(102, "Neha Verma", 40, 500);
        emp2.assignDepartment("IT");

        employees.add(emp1);
        employees.add(emp2);

        // Processing list using Employee reference
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
