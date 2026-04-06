import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class RepeatableAnnotation{
    @Retention(RetentionPolicy.RUNTIME)                  // BugReport Annotation
    @Target(ElementType.METHOD)
    @Repeatable(BugReports.class)
    public @interface BugReport {
        String description();
    }

    @Retention(RetentionPolicy.RUNTIME)                  // Container Annotation for Repeatable
    @Target(ElementType.METHOD)
    public @interface BugReports {
        BugReport[] value();
    }

    @BugReport(description = "Null pointer issue")         // Apply Multiple BugReports on a method
    @BugReport(description = "Incorrect loop condition")
    public void testFeature(){
        System.out.println("Testing feature...");
    }

    public static void main(String[] args) throws Exception{     // Read All BugReports (main method)
        RepeatableAnnotation obj = new RepeatableAnnotation();
        var method = obj.getClass().getMethod("testFeature");
        BugReport[] reports = method.getAnnotationsByType(BugReport.class);
        for(BugReport br : reports){
            System.out.println("Bug: " + br.description());
        }
        obj.testFeature();
    }
}
