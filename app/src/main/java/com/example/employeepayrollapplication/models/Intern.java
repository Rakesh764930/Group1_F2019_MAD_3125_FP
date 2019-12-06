package com.example.employeepayrollapplication.models;

import com.example.employeepayrollapplication.models.Employee;

public class Intern extends Employee {

    //constuctor

    public Intern(int emp_id, String name, int age,  int birthYear, String schoolName,Vehicle vehicle) {
        super(emp_id, name, age, birthYear,vehicle);
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
