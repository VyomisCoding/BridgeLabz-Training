import java.lang.reflect.Field;
import java.util.Map;

class ObjectMapper{
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for(Map.Entry<String, Object> entry : properties.entrySet()){
            Field field = clazz.getDeclaredField(entry.getKey());
            field.setAccessible(true);
            field.set(obj, entry.getValue());
        }
        return obj;
    }
}

class User{
    private String name;
    private int age;
    public String toString(){
        return "User{name='" + name + "', age=" + age + "}";
    }
}

public class CustomMapperTest{
    public static void main(String[] args) throws Exception {
        Map<String, Object> data = Map.of( "name", "Vyomesh", "age", 21);
        User user = ObjectMapper.toObject(User.class, data);
        System.out.println(user);
    }
}
