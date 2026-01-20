import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee Bonus System");
        System.out.println("1. Manager");
        System.out.println("2. Developer");
        System.out.print("Choose Role: ");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        Employee emp;
        if(choice == 1){
            emp = new Manager(name, salary);
        }else{
            emp = new Developer(name, salary);
        }
        System.out.printf("Bonus: %.2f%n", emp.getBonus());    // Polymorphic call
    }
}
