import java.util.ArrayList;

public class SuppressUncheckedWarnings {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        ArrayList list = new ArrayList();        // No generics -> warning suppressed
        list.add("Vyomesh");
        list.add(123);
        list.add(true);
        System.out.println(list);
    }
}
