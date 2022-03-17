package com.bridgelabz;

public class EmpWageComputation {

    static int wage_Per_Hour = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS =4;
    static final int IS_FULL_TIME =1;
    static final int IS_PART_TIME =0;

    public static void main(String[] args) {
        int dailyWages = 0;
        System.out.println("*-*-*-*-Welcome to Employee Wage Computation Problem-*-*-*-*");
        int attendance = (int) Math.floor(Math.random()*3);
        switch (attendance) {
            case IS_FULL_TIME:
                System.out.println(" Employee is Present");
                dailyWages = wage_Per_Hour * FULL_DAY_HOURS;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is Present for the Half Day");
                dailyWages = wage_Per_Hour * PART_TIME_HOURS;
                break;
            default:
                System.out.println("Employee is Absent");
                break;
        }
        System.out.println(" " + dailyWages + " Wages of the day");
    }
}
