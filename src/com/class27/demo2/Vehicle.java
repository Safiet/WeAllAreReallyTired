package com.class27.demo2;

public abstract class Vehicle {
    String vin_number;
    static int totalVehicle;

    Vehicle(String vin_number) {
        totalVehicle++;
        this.vin_number = vin_number;
    }

    public void totalVehiclescreated() {
        System.out.println("we built " + totalVehicle + " Vehicles");
    }

    public void drive() {
        System.out.println("Vehicle can drive");
    }

    public void stop() {
        System.out.println("Vehicle can stop");
    }

    public abstract void start();

}

abstract class Car extends Vehicle {
    String carType;

    Car(String vin_number, String carType) {
        super(vin_number);
        this.carType=carType;
    }
    @Override
    public void drive(){
        System.out.println("car can drive");
    }
    public abstract void speed();
}

class BMW extends Car{

    String make;
    String model;

    BMW(String vin_number, String carType,String make,String model) {
        super(vin_number, carType);
        this.make=make;
        this.model=model;
    }


    @Override
    public void start() {
        System.out.println("BMW can start with remote");
    }

    @Override
    public void speed() {
        System.out.println("BMW can go max speed 365k/H");
    }
    public void display(){
        System.out.println("We build "+ make+ " Model "+model+" "+carType+" Vin Number "+vin_number);
    }}
    class Toyota extends Car{
String make;
String model;
        Toyota(String vin_number, String carType,String make,String model) {
            super(vin_number, carType);
            this.make=make;
            this.model=model;
        }

        @Override
        public void start() {
            System.out.println("Toyota can also start with remote");

        }

        @Override
        public void speed() {
            System.out.println("Toyota max speed is 350 km/h");
        }
        public void display(){
            System.out.println("We build "+ make+ " Model "+model+" "+carType+" Vin Number "+vin_number);
        }
    }

