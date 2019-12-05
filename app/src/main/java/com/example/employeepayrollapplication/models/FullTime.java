package com.example.employeepayrollapplication.models;

import com.example.employeepayrollapplication.models.Employee;

public class FullTime extends Employee {

    //V a r i a b l e     d e c l a r a t i o n
    Double salary;
    Double bonus;


    //Overwriting method of parent class

    public FullTime(int id, String name, int age, double earnings, int birthYear, Double salary, Double bonus) {
        super(id, name, age, earnings, birthYear);
        this.salary = salary;
        this.bonus = bonus;
    }


    Double calcEarnings() {
double earnigs;
        super.earnings = salary + bonus;
        return  super.earnings;
    }
}
