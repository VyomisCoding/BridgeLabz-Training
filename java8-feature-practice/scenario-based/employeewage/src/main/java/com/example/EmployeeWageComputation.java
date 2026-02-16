package com.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// UC 11 - Interface ---------------------------------------------------------------------
interface IEmpWageBuilder{
    void addCompany(String companyName, int wagePerHour, int workingDays, int maxHours);
    void computeWage();
    int getTotalWage(String companyName);
}

// UC 9 - Company Class ------------------------------------------------------
class CompanyEmpWage{
    private final String companyName;
    private final int wagePerHour;
    private final int workingDays;
    private final int maxHours;
    private int totalWage;
    private ArrayList<Integer> dailyWageList;   // UC 13

    public CompanyEmpWage(String companyName, int wagePerHour, int workingDays, int maxHours){
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.maxHours = maxHours;
        this.dailyWageList = new ArrayList<>();
    }

    public void addDailyWage(int dailyWage){
        dailyWageList.add(dailyWage);
    }

    public void setTotalWage(int totalWage){
        this.totalWage = totalWage;
    }

    public int getTotalWage(){
        return totalWage;
    }

    public String getCompanyName(){
        return companyName;
    }

    public int getWagePerHour(){
        return wagePerHour;
    }

    public int getWorkingDays(){
        return workingDays;
    }

    public int getMaxHours(){
        return maxHours;
    }

    public void printDailyWages(){
        System.out.println("Daily Wages: " + dailyWageList);
    }
}

// UC 7–14 - EmpWageBuilder ------------------------------------------------------------------
class EmpWageBuilder implements IEmpWageBuilder{
    private static final int IS_PART_TIME = 1;
    private static final int IS_FULL_TIME = 2;
    private ArrayList<CompanyEmpWage> companyList;   // UC 12
    private Random random;

    public EmpWageBuilder(){
        companyList = new ArrayList<>();
        random = new Random();
    }

    // UC 8 ------------------------------------------------------------------------------------
    public void addCompany(String companyName, int wagePerHour, int workingDays, int maxHours){
        companyList.add(new CompanyEmpWage(companyName, wagePerHour, workingDays, maxHours));
    }

    // UC 7, 10 --------------------------------------------------------------------------------
    public void computeWage(){
        for (CompanyEmpWage company : companyList){
            int totalHours = 0;
            int totalDays = 0;
            while(totalHours < company.getMaxHours() && totalDays < company.getWorkingDays()){
                totalDays++;
                int empType = random.nextInt(3);
                int empHours = 0;
                switch(empType){
                    case IS_PART_TIME:
                        empHours = 4;
                        break;
                    case IS_FULL_TIME:
                        empHours = 8;
                        break;
                    default:
                        empHours = 0;
                }
                totalHours += empHours;
                int dailyWage = empHours * company.getWagePerHour();
                company.addDailyWage(dailyWage);   // UC 13
            }
            int totalWage = totalHours * company.getWagePerHour();
            company.setTotalWage(totalWage);
            System.out.println("\nCompany: " + company.getCompanyName());
            System.out.println("Total Days Worked: " + totalDays);
            System.out.println("Total Hours Worked: " + totalHours);
            System.out.println("Total Wage: " + totalWage);
            company.printDailyWages();
        }
    }

    // UC 14 -------------------------------------------------------------------------------------
    public int getTotalWage(String companyName){
        for(CompanyEmpWage company : companyList){
            if(company.getCompanyName().equals(companyName)){
                return company.getTotalWage();
            }
        }
        return 0;
    }
}

// Main Class
public class EmployeeWageComputation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Employee Wage Computation\n");
        EmpWageBuilder builder = new EmpWageBuilder();
        System.out.print("Enter number of companies: ");
        int numberOfCompanies = sc.nextInt();
        sc.nextLine();  // clear buffer
        for(int i=1;i<=numberOfCompanies;i++){
            System.out.println("\nEnter details for Company " + i);
            System.out.print("Company Name: ");
            String name = sc.nextLine();
            System.out.print("Wage Per Hour: ");
            int wagePerHour = sc.nextInt();
            System.out.print("Working Days Per Month: ");
            int workingDays = sc.nextInt();
            System.out.print("Max Working Hours Per Month: ");
            int maxHours = sc.nextInt();
            sc.nextLine();  // clear buffer
            builder.addCompany(name, wagePerHour, workingDays, maxHours);
        }
        builder.computeWage();
        // UC 14 - Query --------------------------------------------------------------
        System.out.print("\nEnter company name to get total wage: ");
        String queryCompany = sc.nextLine();
        int wage = builder.getTotalWage(queryCompany);
        if(wage != -1){
            System.out.println("Total Wage of " + queryCompany + " is: " + wage);
        }else{
            System.out.println("Company not found.");
        }
    }
}
