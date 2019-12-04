package com.example.employeepayrollapplication.models;

import com.example.employeepayrollapplication.models.Employee;

public class FullTIme extends Employee {

    //V a r i a b l e     d e c l a r a t i o n
    Double salary;
    Double bonus;

    //Overwriting method of parent class

    Double calcEarnings() {
double earnigs;
        super.earnings = salary + bonus;
        return  super.earnings;
    }
}
