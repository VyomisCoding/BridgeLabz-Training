import java.lang.reflect.Field;

class JsonConverter{
    public static String toJson(Object obj) throws Exception{
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        StringBuilder json = new StringBuilder("{");
        for(int i = 0; i<fields.length; i++){
            fields[i].setAccessible(true);
            json.append("\"").append(fields[i].getName()).append("\": ");
            json.append("\"").append(fields[i].get(obj)).append("\"");
            if (i < fields.length - 1) json.append(", ");
        }
        json.append("}");
        return json.toString();
    }
}

class Product{
    private String name = "Laptop";
    private int price = 50000;
}

public class JsonTest{
    public static void main(String[] args) throws Exception{
        Product p = new Product();
        System.out.println(JsonConverter.toJson(p));
    }
}
