package com.example.employeepayrollapplication.models;
public class MotorCycle extends Vehicle  {
    // Motorcycle's Additional variable
    private String  brand;
    private double price;

    public MotorCycle(int make, String plate, String brand, double price) {
        super.setMake(make);
        super.setPlate(plate);
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}