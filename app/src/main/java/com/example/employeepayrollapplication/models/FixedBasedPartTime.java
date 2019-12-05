package com.example.employeepayrollapplication.models;

class FixedBasedPartTime extends PartTime {
    private double FixedAmount;

    public double getFixedAmount() {
        return FixedAmount;
    }

    public FixedBasedPartTime(int emp_id, String name, int age, double earnings, int birthYear, double rate, float hoursWorked, double fixedAmount) {
        super(emp_id, name, age, earnings, birthYear, rate, hoursWorked);
        FixedAmount = fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        FixedAmount = fixedAmount;
    }

}
