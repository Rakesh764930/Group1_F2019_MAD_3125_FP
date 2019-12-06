package com.example.employeepayrollapplication.models;
import java.util.Calendar;
import java.util.Date;


public  class Employee{

    //V a r i a b l e s    d e c l a r a t i o n
private int emp_id;
    private String name = "";
    private int age;
    private Vehicle vehicle;

    private int birthYear = 0 ;

    public Employee(int emp_id, String name, int age) {
        this.emp_id = emp_id;
        this.name = name;
        this.age = age;



    }


    //M e t h o d s    d e c l a r a t i o n

    int calcBirthYear() {

        Date date = new Date();
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        if(age  == 0)
        {
            System.out.println("Age not found!");
        }
        else{
            birthYear += currYear - age;
            //System.out.println("Birth year of " +name + " is " +birthyear);   //Displaying to check result
        }

        return birthYear;
    }

     public double calcEarning(){

        return 1000.00;
    }



    //A d d e d   G e t t  e r   a n d   S e t t e r


    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
