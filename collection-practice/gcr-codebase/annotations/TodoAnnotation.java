import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class TodoAnnotation{
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface Todo{
        String task();
        String assignedTo();
        String priority() default "MEDIUM";
    }

    @Todo(task = "Implement login", assignedTo = "Vyomesh")
    public void loginFeature() {}

    @Todo(task = "Add payment gateway", assignedTo = "Rahul", priority = "HIGH")
    public void paymentFeature() {}

    public static void main(String[] args){
        TodoAnnotation obj = new TodoAnnotation();
        for(Method m : obj.getClass().getDeclaredMethods()){
            if(m.isAnnotationPresent(Todo.class)){
                Todo t = m.getAnnotation(Todo.class);
                System.out.println(m.getName() + " → Task: " + t.task() + ", AssignedTo: " + t.assignedTo() + ", Priority: " + t.priority());
            }
        }
    }
}
