package com.example.employeepayrollapplication.models;

import com.example.employeepayrollapplication.models.Employee;

public class FullTime extends Employee {

    //V a r i a b l e     d e c l a r a t i o n
   private double salary;
    private double bonus;


    //constructor

    public FullTime(int emp_id, String name, int age, int birthYear, double salary, double bonus,Vehicle vehicle) {
        super(emp_id, name, age, birthYear,vehicle);
        this.salary = salary;
        this.bonus = bonus;
    }

}
