package com.example.employeepayrollapplication.models;

public class Car extends Vehicle {

    private String carmodelnum;

    public Car(String carmodelnumber,String make, String plate, int mileage) {
        super(make, plate, mileage);
        this.carmodelnum = carmodelnum;
    }

    public String getCarmodelnumber() {
        return carmodelnum;
    }

    public void setCarmodelnumber(String carmodelnumber) {
        this.carmodelnum = carmodelnum;
    }

//    @Override
//
//    public String printData() {
//
//        return "\nEmployee has Car"+"\nMake : "+this.getMake()+"\nPlate : "+this.getPlate()+"\nCar Model : "+this.getCarmodelnumber()+"\n";
//    }

}