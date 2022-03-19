package com.bridgelabz;

class Calculations{
    static int wage_Per_Hour = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 0;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int TOTAL_WORKING_HOURS_FOR_MONTH = 100;

    public static void startCalculations(){
        Wages wages = new Wages();
        Prints prints = new Prints();

        int dailyWages = 0;
        double totalPresentDays = 0;
        int absentDays = 0;
        int totalWorkinHours = 0;
        int totalWagesofMonth = 0;
        System.out.println();
        System.out.println("*-*-*-*-Welcome to Employee Wage Computation Problem-*-*-*-*");
        for (int i = 1; i <= WORKING_DAYS_PER_MONTH ; i++) {
            if (totalWorkinHours != TOTAL_WORKING_HOURS_FOR_MONTH) {
                int attendance = (int) Math.floor(Math.random() * 3);
                switch (attendance) {
                    case IS_FULL_TIME://Class  Object Created
                        wages.isFullTime();
                        dailyWages = wages.isFullTime();
                        totalWagesofMonth = totalWagesofMonth + dailyWages;
                        totalPresentDays = totalPresentDays + 1;
                        totalWorkinHours = +totalWorkinHours + FULL_DAY_HOURS;
                        break;
                    case IS_PART_TIME:
                        prints.isPartTime();
                        dailyWages = Prints.isPartTime();
                        totalWagesofMonth = totalWagesofMonth + dailyWages;
                        totalPresentDays = totalPresentDays + 0.5;
                        totalWorkinHours = totalWorkinHours + PART_TIME_HOURS;
                        break;
                    default:
                        System.out.println("Employee is Absent");
                        absentDays = absentDays + 1;
                        break;
                }
            }
        }
        System.out.println();
        System.out.println("Toatl Present Days :: " +totalPresentDays);
        System.out.println("Total Working Hours of the month:: "+totalWorkinHours);
        System.out.println("Toatl absent Days:: "+absentDays);
        System.out.println("Total Wages of the Month:: "+totalWagesofMonth);
    }
}
//==============================================================================================

class Wages extends Calculations {
    public static int isFullTime(){
        System.out.println("Employee is Present ::");
        int dailyWages = wage_Per_Hour * FULL_DAY_HOURS;
        System.out.println(dailyWages);
        return dailyWages;

    }
}
class Prints extends Calculations {
    public static int isPartTime(){
        System.out.println("Employee is Present for Half Day ::");
        int dailyWages = wage_Per_Hour * PART_TIME_HOURS;
        System.out.println(dailyWages);
        return dailyWages;
    }
}

//==========================================================================================
public class EmpWageComputation {
    public static void main(String[] args) {
         Calculations calculations = new Calculations();
        Calculations.startCalculations();
    }

}