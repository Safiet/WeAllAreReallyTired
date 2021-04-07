package com.class25.overloading;

public class OverloadingDemo {
    void printInfo(String name){
        System.out.println("name"+name);
    }
    void printInfo(String name, String address){
        System.out.println("name"+name+" Adress "+address);
    }
    void printInfo(String name,int phoneNumber,String address){
        System.out.println("name"+name+" PhoneNumber "+phoneNumber+" Address"+ address);
    }
    void doCalculation(){
        System.out.println(10/0);
    }

}
