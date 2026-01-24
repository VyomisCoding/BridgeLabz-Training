// Map Interface

import java.util.*;

class Employee{
    String name;
    String dept;
    Employee(String n, String d){
        name = n;
        dept = d;
    }
}
public class GroupByDepartment{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Department: ");
            String dept = sc.nextLine();
            employees.add(new Employee(name, dept));
        }
        Map<String, List<Employee>> map = new HashMap<>();
        for(Employee e : employees){
            map.putIfAbsent(e.dept, new ArrayList<>());
            map.get(e.dept).add(e);
        }
        System.out.println("Employees Grouped by Department:");
        for(String dept : map.keySet()){
            System.out.print(dept + ": ");
            for (Employee e : map.get(dept)) {
                System.out.print(e.name + " ");
            }
            System.out.println();
        }
    }
}
