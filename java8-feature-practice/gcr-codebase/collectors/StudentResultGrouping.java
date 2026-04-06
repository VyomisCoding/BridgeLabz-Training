import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
    String name;
    String grade;
    Student(String name,String grade){
        this.name = name;
        this.grade = grade;
    }
}
public class StudentResultGrouping{
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("Amit","A"),new Student("Rahul","B"),new Student("Mohit","A"),new Student("Rohit","C"));
        Map<String,List<String>> result = list.stream().collect(Collectors.groupingBy(s -> s.grade,Collectors.mapping(s -> s.name, Collectors.toList())));
        System.out.println(result);
    }    
}
