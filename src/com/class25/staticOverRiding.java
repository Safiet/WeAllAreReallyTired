package com.class25;

public class staticOverRiding {
    static void printInfo(){
        System.out.println("Bla Bla");
    }
}
class Child extends staticOverRiding{

   /* void printInfo(){
        System.out.println("Bla bla from child class");} ---> CE error becuase we can not overriding static method */
}
