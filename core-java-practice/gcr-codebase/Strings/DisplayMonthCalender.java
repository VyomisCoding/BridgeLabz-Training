import java.util.*;
public class DisplayMonthCalender {
	
    static String getMonthName(int m){// for getting month name
        String[] months = {
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
        };
        return months[m - 1];
    }

    static boolean isLeapYear(int y){// for checking leap year
        if (y % 400 == 0) return true;
        if (y % 100 == 0) return false;
        if (y % 4 == 0) return true;
        return false;
    }
    
    static int getDaysInMonth(int m, int y){// get days in month
        int[] days = { 31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeapYear(y)) {
            return 29;
        }
        return days[m - 1];
    }
    
    static int getFirstDay(int d, int m, int y){// get first day of month (0 = Sun, 1 = Mon ...)

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int startDay = getFirstDay(1, month, year);

        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // indentation before first date
        for (int i = 0; i < startDay; i++){
            System.out.print("    ");
        }
        for (int day = 1; day <= days; day++){// printing days
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
	}
}
