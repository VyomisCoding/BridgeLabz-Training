import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)     // Step 1: Create annotation
@interface Inject {}


class Service{                     // Step 2: Create classes
    void serve() { System.out.println("Service running..."); }
}

class Controller{
    @Inject
    private Service service;
    void execute(){
        service.serve();
    }
}

class DIContainer{               // Step 3: Simple DI Container
    public static void injectDependencies(Object obj) throws Exception{
        Class<?> clazz = obj.getClass();
        for(Field field : clazz.getDeclaredFields()){
            if(field.isAnnotationPresent(Inject.class)){
                field.setAccessible(true);
                Object dependency = field.getType().getDeclaredConstructor().newInstance();
                field.set(obj, dependency);
            }
        }
    }
}

public class DITest{
    public static void main(String[] args) throws Exception{
        Controller controller = new Controller();
        DIContainer.injectDependencies(controller);
        controller.execute();
    }
}
