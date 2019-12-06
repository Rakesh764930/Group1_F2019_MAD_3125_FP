package com.example.employeepayrollapplication.models;

class FixedBasedPartTime extends PartTime {
    private double FixedAmount;



    public FixedBasedPartTime(int emp_id, String name, int age, int birthYear, double rate, double hoursWorked, double fixedAmount,Vehicle vehicle) {
        super(emp_id, name, age, birthYear, rate, hoursWorked,vehicle);
       this.FixedAmount = fixedAmount;
    }

    //getter and setter
    public void setFixedAmount(double fixedAmount) {
        FixedAmount = fixedAmount;
    }
    public double getFixedAmount() {
        return FixedAmount;
    }

    //calculating earnings

    public double fixedAmountCalcEarnings()
    {
        return this.getFixedAmount()+(this.getHoursWorked()*this.getRate());
    }


}
