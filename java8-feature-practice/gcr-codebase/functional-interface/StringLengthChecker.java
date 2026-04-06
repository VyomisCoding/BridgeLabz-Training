import java.util.function.Function;

public class StringLengthChecker{
    public static void main(String[] args){
        int limit = 20;
        Function<String, Integer> lengthFunc = msg -> msg.length();      // Function to get string length
        String message = "Hello, this is too long!";
        int len = lengthFunc.apply(message);
        System.out.println("Message Length: " + len);
        if(len > limit){
            System.out.println("Message exceeds the character limit!");
        }else{
            System.out.println("Message is within limit.");
        }
    }
}
