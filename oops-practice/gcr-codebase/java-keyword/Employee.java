public class Employee {

    static String companyName = "Tech Solutions Inc."; // static variable
    static int totalEmployees = 0;

    String name;
    final int id;
    String designation;

    Employee(int id, String name, String designation){ // parameterized constructor this initialize
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees(){
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Company Name: " + companyName);
    }

    void displayDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args){

        Employee e1 = new Employee(101, "Thamarai", "Software Engineer");
        Employee e2 = new Employee(102, "Rohan", "Project Manager");
        displayTotalEmployees();
        if (e1 instanceof Employee){
            e1.displayDetails();
        }
        System.out.println();
        if (e2 instanceof Employee){
            e2.displayDetails();
        }
    }
}
