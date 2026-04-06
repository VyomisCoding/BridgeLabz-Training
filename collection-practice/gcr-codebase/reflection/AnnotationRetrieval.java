import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)      // Step 1: Create custom annotation
@interface Author{
    String name();
}

@Author(name = "Vyomesh Pandey")         // Step 2: Apply annotation to a class
class DemoClass {
    // some code
}

public class AnnotationRetrieval{
    public static void main(String[] args){
        Class<DemoClass> cls = DemoClass.class;    // Step 3: Use reflection to retrieve annotation
        if(cls.isAnnotationPresent(Author.class)){
            Author author = cls.getAnnotation(Author.class);
            System.out.println("Author Name: " + author.name());
        }else{
            System.out.println("Author annotation not found!");
        }
    }
}
