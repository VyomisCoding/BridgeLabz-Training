import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class ImportantDemo{
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface ImportantMethod{
        String level() default "HIGH";
    }

    @ImportantMethod
    public void processData(){
        System.out.println("Processing data...");
    }

    @ImportantMethod(level = "LOW")
    public void validate(){
        System.out.println("Validating...");
    }

    public static void main(String[] args) throws Exception{
        ImportantDemo obj = new ImportantDemo();
        for(Method m : obj.getClass().getDeclaredMethods()){
            if(m.isAnnotationPresent(ImportantMethod.class)){
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + " → Level: " + im.level());
            }
        }
    }
}
