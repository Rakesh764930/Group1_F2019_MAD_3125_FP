package com.example.employeepayrollapplication.models;



public class PartTime  extends Employee {

    //V a r i a b l e   D e c l a r a t i o n

    private double rate;
    private double  hoursWorked;

    //G e t t e r   a n d   S e t t e r

    public PartTime(int emp_id, String name, int age, int birthYear, double rate, double hoursWorked,Vehicle vehicle) {
        super(emp_id, name, age, birthYear,vehicle);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


}
