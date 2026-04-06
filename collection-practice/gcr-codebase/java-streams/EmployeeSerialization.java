import java.io.*;
import java.util.*;

class Employee implements Serializable{      // Employee class must implement Serializable
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    String department;
    double salary;
    
    Employee(int id, String name, String department, double salary){      // Constructor
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    void display(){      // Display employee details
        System.out.println("ID: " + id +", Name: " + name +", Department: " + department +", Salary: ₹" + salary);
    }
}

public class EmployeeSerialization{
    static final String FILE_NAME = "employees.dat";
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();                     // Create list of employees
        employees.add(new Employee(1, "Amit", "IT", 60000));
        employees.add(new Employee(2, "Neha", "HR", 45000));
        employees.add(new Employee(3, "Ravi", "Finance", 55000));
        
        saveEmployees(employees);      // Serialize employee list
        loadEmployees();               // Deserialize and display employee list
    }
    
    static void saveEmployees(List<Employee> employees){      // Method to serialize employees
        try (ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            oos.writeObject(employees);
            System.out.println("Employees saved successfully.\n");
        }catch (IOException e){
            System.out.println("Error while saving employees.");
            e.printStackTrace();
        }
    }

    static void loadEmployees(){     // Method to deserialize employees
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){       
            List<Employee> employees = (List<Employee>) ois.readObject();     // Read object and cast it
            System.out.println("Employees loaded from file:"); 
            for(Employee emp : employees){
                emp.display();
            }
        }catch(IOException e){
            System.out.println("Error while reading employees.");
            e.printStackTrace();

        }catch(ClassNotFoundException e){
            System.out.println("Employee class not found.");
            e.printStackTrace();
        }
    }
}