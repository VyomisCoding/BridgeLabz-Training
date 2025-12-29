import java.util.*;
public class EmployeeWageComputation {
	
	static final int isPartTime = 1;
    static final int isFullTime = 2;
    static final int wagePerHour = 20;
    static final int fullDayHour = 8;
    static final int partTimeHour = 8;
    static final int workingDaysPerMonth = 20;
    static final int maxWorkingHours = 100;

    static Random random = new Random();
    
	public static void main(String[] args){
		
		displayWelcomeMessage();
        checkEmployeeAttendance();            // Use Case 1
        calculateDailyWage();                 // Use Case 2
        calculatePartTimeWage();              // Use Case 3
        calculateWageUsingSwitch();           // Use Case 4
        calculateMonthlyWage();               // Use Case 5
        calculateWageWithCondition();         // Use Case 6
       
	}
	// ---------------- USE CASE 0 ( Display Welcome Message )--------------------------------------------------------------------------------
	
    static void displayWelcomeMessage() {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch\n");
    }
    
    // ---------------- USE CASE 1 ( Check Employee is Present or Absent )----------------------------------------------------------------------
    
    static void checkEmployeeAttendance() {
        int attendance = random.nextInt(2);

        if (attendance == 1) {
            System.out.println("USE CASE 1: Employee is Present");
        } else {
            System.out.println("USE CASE 1: Employee is Absent");
        }
    }
    
    // ---------------- USE CASE 2 ( Calculate Daily Employee Wage (Full Time) ) -------------------------------------------------------------

    static void calculateDailyWage() {
        int dailyWage = fullDayHour * wagePerHour;
        System.out.println("USE CASE 2: Daily Employee Wage = " + dailyWage);
    }

    // ---------------- USE CASE 3 ( Calculate Part Time Employee Wage )----------------------------------------------------------------------
    
    static void calculatePartTimeWage() {
        int partTimeWage = partTimeHour * wagePerHour;
        System.out.println("USE CASE 3: Part Time Employee Wage = " + partTimeWage);
    }
    
    // ---------------- USE CASE 4 ( Solve using Switch Case )-------------------------------------------------------------------------------
    
    static void calculateWageUsingSwitch() {
        int empType = random.nextInt(3);
        int empHours;

        switch (empType) {
            case isPartTime:
                empHours = partTimeHour;
                System.out.println("USE CASE 4: Employee is Part Time");
                break;

            case isFullTime:
                empHours = fullDayHour;
                System.out.println("USE CASE 4: Employee is Full Time");
                break;

            default:
                empHours = 0;
                System.out.println("USE CASE 4: Employee is Absent");
        }
        int wage = empHours * wagePerHour;
        System.out.println("USE CASE 4: Wage using Switch Case = " + wage);
    }
    
    // ---------------- USE CASE 5 ( Calculate Monthly Wage (20 Working Days) )---------------------------------------------------------------

    static void calculateMonthlyWage() {
        int monthlyWage = workingDaysPerMonth * fullDayHour * wagePerHour;
        System.out.println("USE CASE 5: Monthly Wage = " + monthlyWage);
    }
    
    // ---------------- USE CASE 6 ( Calculate Wages till Max Hours or Days Reached )---------------------------------------------------------

    static void calculateWageWithCondition() {
        int totalHours = 0;
        int totalDays = 0;
        while (totalHours < maxWorkingHours && totalDays < workingDaysPerMonth) {
            totalDays++;
            int empType = random.nextInt(3);
            int empHours;
            switch (empType) {
                case isPartTime:
                    empHours = partTimeHour;
                    break;

                case isFullTime:
                    empHours = fullDayHour;
                    break;
                default:
                    empHours = 0;
            }
            totalHours += empHours;
        }
        int totalWage = totalHours * wagePerHour;
        System.out.println("USE CASE 6: Total Working Days = " + totalDays);
        System.out.println("USE CASE 6: Total Working Hours = " + totalHours);
        System.out.println("USE CASE 6: Total Monthly Wage = " + totalWage);
    }
}
