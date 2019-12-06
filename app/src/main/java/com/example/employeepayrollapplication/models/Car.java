package com.example.employeepayrollapplication.models;

public class Car extends Vehicle {

    private String carmodelnumber;

    }

    public String getCarmodelnumber() {
        return carmodelnumber;
    }

    public void setCarmodelnumber(String carmodelnumber) {
        this.carmodelnumber = carmodelnumber;
    }

    @Override
    public String printData() {

        return "\nEmployee has Car"+"\nMake : "+this.getMake()+"\nPlate : "+this.getPlate()+"\nCar Model : "+this.getCarmodelnumber()+"\n";
    }

}