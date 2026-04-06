import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils{
    static String format(LocalDate date, String pattern){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class DateFormatTest{
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        System.out.println("dd/MM/yyyy : " + DateUtils.format(today, "dd/MM/yyyy"));
        System.out.println("yyyy-MM-dd : " + DateUtils.format(today, "yyyy-MM-dd"));
        System.out.println("MMM dd, yyyy : " + DateUtils.format(today, "MMM dd, yyyy"));
    }
}
