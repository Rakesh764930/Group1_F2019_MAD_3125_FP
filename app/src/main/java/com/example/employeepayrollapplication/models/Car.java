package com.example.employeepayrollapplication.models;

public class Car extends Vehicle {

    // Car's Additional Variable

    private String  color;
    private int NumberOfSeats;
    private int make;
    private String plate;

    public Car(int make, String plate, String color, int numberOfSeat) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        NumberOfSeats = numberOfSeat;
    }

// Getters and setters


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(byte numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }



}