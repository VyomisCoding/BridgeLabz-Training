import java.util.*;
public class EmployeeBonusUsingMethods {
	
	public static int[][] generateSalaryAndService() {
        Random r = new Random();
        int[][] data = new int[10][2]; // [salary, years]

        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + r.nextInt(90000); // 5-digit salary
            data[i][1] = 1 + r.nextInt(15);        // service years
        }
        return data;
    }
	
	public static double[][] calculateNewSalary(int[][] data) {
        double[][] finalData = new double[10][2]; // [new salary, bonus]

        for (int i = 0; i < 10; i++) {
            int salary = data[i][0];
            int years = data[i][1];

            double bonus;
            if (years > 5) bonus = salary * 0.05;
            else bonus = salary * 0.02;

            double newSalary = salary + bonus;

            finalData[i][0] = newSalary;
            finalData[i][1] = bonus;
        }
        return finalData;
    }

	public static void main(String[] args) {
		int[][] oldData = generateSalaryAndService();
        double[][] newData = calculateNewSalary(oldData);

        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("--------------------------------------------------------------");
        System.out.println("  Salary   Years   New Salary    Bonus");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            int salary = oldData[i][0];
            int years = oldData[i][1];
            double newSalary = newData[i][0];
            double bonus = newData[i][1];
            totalOld += salary;
            totalNew += newSalary;
            totalBonus += bonus;
            System.out.printf("%8d   %5d   %12.2f   %8.2f\n", salary, years, newSalary, bonus);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);
        System.out.println("Total Bonus Paid = " + totalBonus);
    }
}