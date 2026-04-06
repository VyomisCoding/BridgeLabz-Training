import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class GetClassInfo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter class name (e.g., java.util.ArrayList): ");
        String className = sc.nextLine();
        try{
            Class<?> cls = Class.forName(className);
            System.out.println("\nClass Name: " + cls.getName());
            System.out.println("\n-Fields-");
            for(Field f : cls.getDeclaredFields()){
                System.out.println(f);
            }
            System.out.println("\n-Methods-");
            for(Method m : cls.getDeclaredMethods()){
                System.out.println(m);
            }
            System.out.println("\n-Constructors-");
            for(Constructor<?> c : cls.getDeclaredConstructors()){
                System.out.println(c);
            }
        }catch(ClassNotFoundException e){
            System.out.println("Class not found! Please check the name.");
        }
    }
}
