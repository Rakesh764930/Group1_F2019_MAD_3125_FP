package com.example.employeepayrollapplication.models;

import com.example.employeepayrollapplication.models.Employee;

public class Intern extends Employee {
    public Intern(int id, String name, int age, double earnings, int birthYear, String schoolName) {
        super(id, name, age, earnings, birthYear);
        this.schoolName = schoolName;
    }

    //V a r i a b l e    D e c l a r a t  i o  n

    private String schoolName;

    //G e t t e r   a n d    S e t t e r

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }




}
