import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class LoggingAnnotation{
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface LogExecutionTime {}

    @LogExecutionTime
    public void fastTask(){
        for(int i=0;i<10000;i++);
    }

    @LogExecutionTime
    public void slowTask(){
        for(int i=0; i<5000000; i++);
    }

    public static void main(String[] args) throws Exception{
        LoggingAnnotation obj = new LoggingAnnotation();
        for (Method m : obj.getClass().getDeclaredMethods()){
            if (m.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                m.invoke(obj);
                long end = System.nanoTime();
                System.out.println(m.getName() + " took " + (end - start) + " ns");
            }
        }
    }
    
}
