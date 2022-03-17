package com.bridgelabz;

public class EmpWageComputation {

    static int wage_Per_Hour = 20;
    static final int FULL_DAY_HOURS = 8;

    public static void main(String[] args) {
        int dailyWages = 0;
        System.out.println("*-*-*-*-Welcome to Employee Wage Computation Problem-*-*-*-*");
        int attendance = (int) Math.floor(Math.random()*2);
        if (attendance==0){
            System.out.println(" Employee is Present");
            dailyWages = wage_Per_Hour * FULL_DAY_HOURS;
        }
        else
            System.out.println("Employee is Absent");
        System.out.println(" " + dailyWages + " These are the daily wages for the Full day");
    }
}
