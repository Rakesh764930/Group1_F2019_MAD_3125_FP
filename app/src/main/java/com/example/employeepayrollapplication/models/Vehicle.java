package com.example.employeepayrollapplication.models;


    public  class Vehicle  {
        private String make;
        private String plate;
        private String mileage ;




        public Vehicle(String make, String plate, String mileage) {
            this.make = make;
            this.plate = plate;
            this.mileage = mileage;
        }
        public String getMake() {
            return make;
        }
        public void setMake(String make) {
            this.make = make;
        }
        public String getPlate() {
            return plate;
        }
        public void setPlate(String plate) {
            this.plate = plate;
        }
        public String getMileage() {
            return mileage;
        }
        public void setMileage(String mileage) {
            this.mileage = mileage;
        }



    }
