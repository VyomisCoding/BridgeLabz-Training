import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class MaxLengthAnnotation{
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface MaxLength{
        int value();
    }

    public static class User{
        @MaxLength(10)
        String username;
        public User(String username) throws Exception{
            this.username = username;
            Field f = this.getClass().getDeclaredField("username");
            MaxLength ml = f.getAnnotation(MaxLength.class);
            if(username.length() > ml.value()){
                throw new IllegalArgumentException("Username too long!");
            }
        }
    }

    public static void main(String[] args) throws Exception{
        new User("Vyomesh");             // OK
        new User("VyomeshPandey123");    // Throws exception
    }
}
