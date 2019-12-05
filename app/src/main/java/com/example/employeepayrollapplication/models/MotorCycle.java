package com.example.employeepayrollapplication.models;

import com.example.employeepayrollapplication.models.Vehicle;

public class MotorCycle extends Vehicle {
    // Motorcycle's Additional variable
    private String  model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public MotorCycle(int make, String plate, String model) {
        super(make, plate);
        this.model = model;
    }



}