import java.util.*;
public class DisplayCalenderUsingMethods {
	
	// Method for getting month name
    public static String getMonthName(int m) {
        String[] names = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return names[m - 1];
    }
    // Leap Year method
    public static boolean isLeap(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }
    
    // b) Method to get number of days in a month
    public static int getDays(int m, int y) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (m == 2 && isLeap(y)) {
            return 29;
        }
        return days[m - 1];
    }

    // c) Method to get first day using Gregorian Calendar algorithm
    public static int getFirstDay(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }
    
    public static void displayCalendar(int month, int year){ //Display calendar
        String monthName = getMonthName(month);
        int daysCount = getDays(month, year);
        System.out.println("\n       " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int startDay = getFirstDay(1, month, year);
        // First loop: printing blank spaces before day 1
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        // Second loop: printing dates
        for (int date = 1; date <= daysCount; date++) {
            System.out.printf("%3d ", date);
            if ((date + startDay) % 7 == 0) {
                System.out.println();  // Next line on Saturday
            }
        }
        System.out.println(); // final new line
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        displayCalendar(month, year);
	}
	
}
