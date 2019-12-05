package com.example.employeepayrollapplication.models;

import java.util.Dictionary;
import java.util.Hashtable;

public class Singleton{


    Dictionary emp_dict = new Hashtable();
    private static Singleton _instance;

        private Singleton()
        {

        }

        public static Singleton getInstance1()
        {
            if (_instance == null)
            {
                _instance = new Singleton();
            }
            return _instance;
        }



        //function to add customer in dictionary
        public void  addEmployeeToDictionary(Employee e) {
            emp_dict.put(id,e);
        }
        //funtion to create customer objects and add using above function
       public void  alreadyEmployee() {
        // Employee 1

           FullTime f1 = new FullTime(1,"Ajeet Singh",22,250,25000,"FullTime");
        Car = new Car( "Ferrari",  2, 2019, "LVE142", "Car");
        f1.addVehicle(v: c1)
        MotorCycle m1 = Motorcycle("Ducati",  "Motorcycle",  "LFM421",  2019);
        f1.addVehicle(v: m1)

        // Customer 2
           FixedBasedPartTime p1 = new FixedBasedPartTime(id:2, fixedAmount: 500, rate: 10, hoursWorked: 40, name: "Rakesh Kumar", age: 22, type: "Fixed Based PartTime")
       Car c2 = new Car("Ferrari",  2,  2019,  "LVE142", "Car");
        p1.addVehicle(v: c2)

        addEmployeeToDictionary(e: f1)
        addEmployeeToDictionary(e: p1)
        }

        //funtion to add customer
//    func addEmployeeFullTime(firstname:String, lastname:String, age:Int, type: String)
//    {
//        let cId = empDict.count+1
////
//        let empType = type
//        if empType.elementsEqual("FullTime"){}
//        addEmployeeToDictionary(e: e)
//
//    }

       public int  returnCount()  {
        return emp_dict.size();
        }

        //Return Customer Object
        public Employee returnEmpObj(int empId)
        {
        for(key,value) in empDict
        {
        if key==empId
        {
        return value
        }
        }
        return nil
        }

        }