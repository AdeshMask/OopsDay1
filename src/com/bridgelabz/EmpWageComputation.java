package com.bridgelabz;

public class EmpWageComputation {

    static int wage_Per_Hour = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 0;
    static final int WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        int totalWagesofMonth = 0;
        int dailyWages = 0;
        double totalPresentDays = 0;
        int absentDays = 0;
        System.out.println("*-*-*-*-Welcome to Employee Wage Computation Problem-*-*-*-*");
        for (int i = 1; i <= WORKING_DAYS_PER_MONTH; i++) {
            int attendance = (int) Math.floor(Math.random() * 3);
            switch (attendance) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Present");
                    dailyWages = wage_Per_Hour * FULL_DAY_HOURS;
                    totalWagesofMonth = totalWagesofMonth + dailyWages;
                    totalPresentDays = totalPresentDays + 1;
                    break;
                case IS_PART_TIME:
                    System.out.println("Present for Half Day");
                    dailyWages = wage_Per_Hour * PART_TIME_HOURS;
                    totalWagesofMonth = totalWagesofMonth + dailyWages;
                    totalPresentDays = totalPresentDays + 0.5;
                    break;
                default:
                    System.out.println("Employee is Absent\n");
                    absentDays = absentDays + 1;
                    break;
            }
        }
        System.out.println();
        System.out.println("Toatl Present Days :: " +totalPresentDays);
        System.out.println("Toatl absent Days:: "+absentDays);
        System.out.println("Total Wages of the Month:: "+totalWagesofMonth);

    }
}
