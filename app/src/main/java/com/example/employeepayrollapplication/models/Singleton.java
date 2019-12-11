package com.example.employeepayrollapplication.models;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Singleton {


    static Singleton obj = null;
    List<Employee> employees;
    private Singleton()
    {


        employees = new ArrayList<>();

        Intern i1 = new Intern(1,"Rajdeep Kaur",21,"Lambton college",new Car("2017","LVL12",13,"Mustang",4) );
        FullTime f1 = new FullTime(2,"Rakesh Kumar",21,150000,1998, new Car("2019", "LVL852", 67, "Beamer", 5));
        CommissionBasedPartTime c1 = new CommissionBasedPartTime(7,"Jay-Z", 35,233,12,12,new MotorCycle("1234","fgklf",41,"dfdh","dff"));
        FixedBasedPartTime ft1 = new FixedBasedPartTime(1,"Raijk",14,59289,14,145,new Car("asdd","esr",14,"rtrt",7));


        addIntoList(i1);
        addIntoList(f1);
        addIntoList(c1);
        addIntoList(ft1);
    }
    public static Singleton getObj()
    {
        if(obj == null)
        {
            obj = new Singleton();

        }
        return obj;
    }
    public void addIntoList(Employee temp)
    {
        employees.add(temp);

    }



    public ArrayList<Employee> getList()
    {
        return  ((ArrayList<Employee>)this.employees);
    }



}
