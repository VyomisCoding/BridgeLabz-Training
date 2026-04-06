import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAnnotations{
    @Retention(RetentionPolicy.RUNTIME)          // Annotation Definition
    @Target(ElementType.METHOD)
    public @interface TaskInfo{
        String priority();
        String assignedTo();
    }

    @TaskInfo(priority = "High", assignedTo = "Vyomesh")     // Method using @TaskInfo
    public void completeTask() {
        System.out.println("Task Completed!");
    }

    public static void main(String[] args) throws Exception{   // Read Annotation Using Reflection (main method)
        CustomAnnotations obj = new CustomAnnotations();
        var method = obj.getClass().getMethod("completeTask");
        TaskInfo info = method.getAnnotation(TaskInfo.class);
        System.out.println("Priority: " + info.priority());
        System.out.println("Assigned To: " + info.assignedTo());
        obj.completeTask();
    }
}
