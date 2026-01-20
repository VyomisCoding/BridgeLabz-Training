public abstract class Employee{     // abstract employee class
    private final String name;      // immutable fields
    private final double salary;

    public Employee(String name, double salary){   // constructor
        this.name = name;
        this.salary = salary;
    }
    public String getName(){        // getter for name
        return name;
    }
    public double getSalary(){      // getter for salary
        return salary;
    }
    public abstract double getBonus();   // abstract bonus method
}
