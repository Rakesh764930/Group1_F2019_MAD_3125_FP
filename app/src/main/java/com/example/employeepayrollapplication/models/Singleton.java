package com.example.employeepayrollapplication.models;

import java.util.Dictionary;
import java.util.Hashtable;

public class Singleton{


    Dictionary emp_dict = new Hashtable();
    private static Singleton instance;

        private Singleton()
        {

        }

        public static Singleton getInstance1()
        {
            if (instance == null)
            {
                instance = new Singleton();
            }
            return instance;
        }



        //function to add customer in dictionary
        public void  addEmployeeToDictionary(Employee e) {
            emp_dict.put(emp,e);
        }
        //funtion to create customer objects and add using above function
       public void  alreadyEmployee() {
        // Employee 1

           FullTime f1=new FullTime(1,"Rakesh",21,2000,2019,200,200,FullTime);
      //Car c1=new Car(1998,"lvl123","Ducati",2);
           //f1.addVehicle(v: c1)
//MotorCycle m1=new MotorCycle(1,"Hayabhusa","lald");
           //f1.addVehicle(v: m1)

           // Customer 2

FixedBasedPartTime f2=new FixedBasedPartTime(12,"Ajeet",21,2344,2019,1234,12,133);           let c2 = Car(brand: "Ferrari", numberOfSeats: 2, make: 2019, plate: "LVE142",type: "Car")
         //  p1.addVehicle(v: c2)

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
           int id=empId;
           for(int key)
        if id==
//            emp_dict.forEach((k, v) -> emp_dict.put(k, v));
//        {
//        if key==empId
//        {
//        return value
//        }
//        }
//        return nil
//        }

        }