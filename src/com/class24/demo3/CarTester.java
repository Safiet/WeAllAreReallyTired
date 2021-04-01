package com.class24.demo3;

public class CarTester {
    public static void main(String[] args) {
        Car car1 = new BMW();
        car1.start(); // method from child will be called because we have over writing
        car1.stop(); //merthod from Parent wil be called because we have not over writing
        // car1.drifting();

        BMW bmw1 = (BMW) car1;
      bmw1.drifting();

        Car car=new Tesla();
        BMW bmw2=(BMW)car;

        BMW bmw=new BMW();




    }


}
