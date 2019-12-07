package com.example.employeepayrollapplication.models;

import com.example.employeepayrollapplication.models.Vehicle;

public class MotorCycle extends Vehicle {
    // Motorcycle's Additional variable
    private String  model;
    private String type;


    public MotorCycle(String make, String plate, int mileage, String model, String type) {
        super(make, plate, mileage);
        this.model = model;
        this.type = type;
    }
}