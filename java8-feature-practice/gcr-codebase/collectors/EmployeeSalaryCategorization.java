import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Employee{
    String department;
    double salary;
    Employee(String department, double salary){
        this.department = department;
        this.salary = salary;
    }
    public String getDepartment(){
        return department;
    }
    public double getSalary(){
        return salary;
    }
}

public class EmployeeSalaryCategorization{
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee("IT", 60000),
                new Employee("IT", 75000),
                new Employee("HR", 50000),
                new Employee("HR", 65000),
                new Employee("Finance", 90000));
        Map<String, Double> avgSalaryByDept = employees.stream().collect(Collectors.groupingBy( Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryByDept);
    }
    
}