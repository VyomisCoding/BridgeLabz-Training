import java.util.*;

class Employee{
    String name;
    int id;
    double salary;

    void getDetails(Scanner sc){
        System.out.print("Enter the Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter the Employee ID: ");
        id = sc.nextInt();
        System.out.print("Enter the Employee Salary: ");
        salary = sc.nextDouble();
    }

    void displayDetails(){
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class DisplayEmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        emp.getDetails(sc);
        emp.displayDetails();
    }
}
