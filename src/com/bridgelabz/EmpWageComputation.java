package com.bridgelabz;

public class EmpWageComputation {

    public static void main(String[] args) {
        System.out.println("*-*-*-*-Welcome to Employee Wage Computation Problem-*-*-*-*");
        int attendance = (int) Math.floor(Math.random()*2);
        if (attendance==0)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
