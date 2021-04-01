package com.class20.AnimalsExamples;

import com.class20.AnimalsExamples.Animals;

public class Cat extends Animals {
Cat(String name){
    this.name=name;
}
    void run(){
        System.out.println(name+" is run");
    }
    void walk() {
        System.out.println(name + " is walking");
    }
    void meow(){
        System.out.println(name+" is meowing");
    }




}
