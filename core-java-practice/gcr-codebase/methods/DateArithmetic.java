import java.util.*;
import java.time.LocalDate;

public class DateArithmetic{
	static LocalDate modifyDate(LocalDate date) {
        date = date.plusDays(7);
        date = date.plusMonths(1);
        date = date.plusYears(2);
        date = date.minusWeeks(3);
        return date;
    }
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter date (yyyy-mm-dd): ");
	        LocalDate inputDate = LocalDate.parse(sc.next());
	        LocalDate finalDate = modifyDate(inputDate);
	        System.out.println("Final Date after calculations: " + finalDate);

	}

}
