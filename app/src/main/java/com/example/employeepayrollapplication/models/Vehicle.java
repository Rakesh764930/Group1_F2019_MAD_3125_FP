package com.example.employeepayrollapplication.models;

public class Vehicle {
    // Variable Declaration
 int make;
 String plate;
 String type;

    public Vehicle(int make, String plate, String type) {
        this.make = make;
        this.plate = plate;
        this.type = type;
    }

    // Getters And Setters


    public int getMake() {
        return make;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}