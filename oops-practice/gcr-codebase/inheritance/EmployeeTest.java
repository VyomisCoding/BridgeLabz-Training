
class Employee{   // Parent class Employee
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary){  // Constructor to initialize employee details...
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails(){      // Method to display common employee details...
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee{  // Manager class inherits Employee
    int teamSize;

    Manager(String name, int id, double salary, int teamSize){  // Constructor using super to call parent constructor
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails(){  // Overriding displayDetails to add manager-specific data
        super.displayDetails();  // call parent method
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee{ // Developer class inherits Employee
    String programmingLanguage;
    Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.programmingLanguage = language;
    }
    
    void displayDetails(){     // Overriding displayDetails for developer
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee{   // Intern class inherits Employee
    Intern(String name, int id, double salary) {
        super(name, id, salary);
    }
}

public class EmployeeTest{
    public static void main(String[] args) {
        Manager m = new Manager("Amit", 101, 80000, 10);   // Creating objects of different employee types
        Developer d = new Developer("Ravi", 102, 60000, "Java");
        Intern i = new Intern("Neha", 103, 15000);

        m.displayDetails();         // Displaying details of each employee
        System.out.println();

        d.displayDetails();
        System.out.println();

        i.displayDetails();
    }
}
