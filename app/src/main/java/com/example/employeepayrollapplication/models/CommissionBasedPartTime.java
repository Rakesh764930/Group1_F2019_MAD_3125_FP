package com.example.employeepayrollapplication.models;

public class CommissionBasedPartTime extends PartTime {

    private double  commissionPerc;


    public CommissionBasedPartTime(int emp_id, String name, int age, double earnings, int birthYear, double rate, float hoursWorked, double commissionPerc) {
        super(emp_id, name, age, earnings, birthYear, rate, hoursWorked);
        this.commissionPerc = commissionPerc;
    }
}