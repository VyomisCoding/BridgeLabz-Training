import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

public class JsonDemo{
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface JsonField {
        String name();
    }

    public static class User{
        @JsonField(name = "user_name")
        String username;
        @JsonField(name = "user_age")
        int age;
        public User(String username, int age){
            this.username = username;
            this.age = age;
        }
    }

    public static String toJson(Object obj) throws Exception{
        Map<String, Object> map = new LinkedHashMap<>();
        for(Field f : obj.getClass().getDeclaredFields()){
            if(f.isAnnotationPresent(JsonField.class)){
                f.setAccessible(true);
                String key = f.getAnnotation(JsonField.class).name();
                Object val = f.get(obj);
                map.put(key, val);
            }
        }
        return map.toString();
    }

    public static void main(String[] args) throws Exception{
        User u = new User("Vyomesh", 21);
        System.out.println(toJson(u));
    }
}
