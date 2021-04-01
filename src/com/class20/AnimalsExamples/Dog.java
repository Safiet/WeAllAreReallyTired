package com.class20.AnimalsExamples;

import com.class20.AnimalsExamples.Animals;

public class Dog extends Animals {

Dog(String name){
    this.name=name;
}

    void run(){
        System.out.println(name+" is run");
    }
    void walk() {
        System.out.println(name+ " is walking");
    }
    void bark(){
        System.out.println(name+" is barking");
    }

}
