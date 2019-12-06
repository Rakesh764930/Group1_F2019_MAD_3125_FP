package com.example.employeepayrollapplication.models;

import com.example.employeepayrollapplication.models.Vehicle;

public class MotorCycle extends Vehicle {
    // Motorcycle's Additional variable
    private String  model;
    private int mile_age;

    public MotorCycle(int make, String plate, String type, String model, int mile_age) {
        super(make, plate, type);
        this.model = model;
        this.mile_age = mile_age;
    }

}