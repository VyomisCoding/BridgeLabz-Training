import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class RoleDemo{
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface RoleAllowed{
        String value();
    }

    public static String currentUserRole = "USER";   // simulate user role
    @RoleAllowed("ADMIN")
    public void deleteDatabase(){
        System.out.println("Database Deleted!");
    }

    public static void main(String[] args) throws Exception{
        RoleDemo obj = new RoleDemo();
        for(Method m : obj.getClass().getDeclaredMethods()){
            if(m.isAnnotationPresent(RoleAllowed.class)){
                RoleAllowed r = m.getAnnotation(RoleAllowed.class);
                if (currentUserRole.equals(r.value()))
                    m.invoke(obj);
                else
                    System.out.println("Access Denied for " + m.getName());
            }
        }
    }
}
