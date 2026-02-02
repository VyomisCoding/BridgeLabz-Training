import java.lang.reflect.Method;

class Task{
    public void process() throws Exception{
        Thread.sleep(500);
        System.out.println("Task completed!");
    }
}

public class MethodTiming{
    public static void main(String[] args) throws Exception{
        Task task = new Task();
        Method method = Task.class.getMethod("process");
        long start = System.currentTimeMillis();
        method.invoke(task);
        long end = System.currentTimeMillis();
        System.out.println("Execution Time: " + (end - start) + " ms");
    }
}
