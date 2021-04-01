package com.class24.demo3;

public class Car {
    String make;
    String model;
    void start(){
        System.out.println("Use the key to start me");
    }
    void stop(){
        System.out.println("use the breaks to stop me");
    }
    void park(){
        System.out.println("Park me manuaklly");
    }

    }
    class BMW extends Car{
    void start(){
        System.out.println("Use the Button to start me");

        }
        void drifting(){
            System.out.println("i can drift really ");
        }


    }
        class Tesla extends Car{
        void start(){
            System.out.println("Use app start me");
                }
                void park(){
                    System.out.println("Park me using sensors and camera");

        }
        class Toyota extends Car{

        }
    }

