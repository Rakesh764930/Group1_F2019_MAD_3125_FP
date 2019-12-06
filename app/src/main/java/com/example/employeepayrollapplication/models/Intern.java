package com.example.employeepayrollapplication.models;

import com.example.employeepayrollapplication.models.Employee;

public class Intern extends Employee {

    //constuctor

    public Intern(int emp_id, String name, int age,  int birthYear, String schoolName,Vehicle vehicle) {
        super(emp_id, name, age, birthYear,vehicle);
        this.schoolName = schoolName;
    }



}
