import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheDemo{
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface CacheResult {}
    static Map<Integer, Integer> cache = new HashMap<>();
    @CacheResult
    public int expensiveCalc(int n){
        try{ Thread.sleep(500); } catch (Exception e) {} // simulate heavy
        return n * n;
    }

    public static void main(String[] args) throws Exception{
        CacheDemo obj = new CacheDemo();
        Method m = obj.getClass().getMethod("expensiveCalc", int.class);
        int input = 5;
        if(cache.containsKey(input)){
            System.out.println("From Cache: " + cache.get(input));
        }else{
            int result = (int) m.invoke(obj, input);
            cache.put(input, result);
            System.out.println("Computed: " + result);
        }
        if (cache.containsKey(input)){         // Call again to test cache
            System.out.println("From Cache: " + cache.get(input));
        }
    }
}
