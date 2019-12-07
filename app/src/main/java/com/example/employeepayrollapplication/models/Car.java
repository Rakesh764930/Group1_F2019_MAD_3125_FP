package com.example.employeepayrollapplication.models;

public class Car extends Vehicle {

    private  String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumber_of_seats() {
        return number_of_seats;
    }

    public void setNumber_of_seats(int number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    private int number_of_seats;

    public Car(String make, String plate, int mileage, String brand, int number_of_seats) {
        super(make, plate, mileage);
        this.brand = brand;
        this.number_of_seats = number_of_seats;
    }

}