package com.example.employeepayrollapplication.models;

public class Car extends Vehicle {

    // Car's Additional Variable

    private String  brand;
    private int NumberOfSeats;

    public Car(int make, String  plate, String brand, int numberOfSeats) {
        super(make, plate);
        this.brand = brand;
        NumberOfSeats = numberOfSeats;
    }
// Getters and setters


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }
}