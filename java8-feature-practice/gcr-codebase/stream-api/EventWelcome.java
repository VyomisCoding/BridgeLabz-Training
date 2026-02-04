import java.util.Arrays;
import java.util.List;

public class EventWelcome{
    public static void main(String[] args){
        List<String> attendees = Arrays.asList("Vyomesh", "Amit", "Mohit", "Rohit", "Kiran" );
        attendees.forEach(name ->
                System.out.println("Welcome to the Event, " + name + "!")
        );
    }
}
