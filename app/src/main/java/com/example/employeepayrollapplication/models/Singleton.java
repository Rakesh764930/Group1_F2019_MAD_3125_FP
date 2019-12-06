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

        Intern i1 = new Intern(1,"Rajdeep Kaur",21,1998,"Lambton college",null);
        FullTime f1 = new FullTime(2,"Rakesh Kumar",21,150000,1998,140000,new Car(1998,"LVL123","Sports","Audi",4));
        CommissionBasedPartTime c1 = new CommissionBasedPartTime(3,"Ajeet Singh",21,1998,20,20,20,new MotorCycle(1998,"LVL456","racing","Suzuki",45));
        FixedBasedPartTime ft1 = new FixedBasedPartTime(4,"Rahul",20,1999,21,34,50.45,new Car(1998,"LVL123","Sports","Ferrari",4));



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
