package com.example.employeepayrollapplication.models;

public class CommissionBasedPartTime extends PartTime {

    private double  commissionPerc;


    public double getCommissionPerc() {
        return commissionPerc;
    }

    public void setCommissionPerc(double commissionPerc) {
        this.commissionPerc = commissionPerc;
    }

    public CommissionBasedPartTime(int emp_id, String name, int age, double rate, double hoursWorked, double commissionPerc, Vehicle vehicle) {
        super(emp_id, name, age, rate, hoursWorked, vehicle);
        this.commissionPerc = commissionPerc;
    }
    public double commissionCalcEarnings()
    {
        return (this.getCommissionPerc()/100*(this.getHoursWorked()*this.getRate()))+(this.getHoursWorked()*this.getRate());
    }

}