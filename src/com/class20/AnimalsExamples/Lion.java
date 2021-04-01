package com.class20.AnimalsExamples;

import com.class20.AnimalsExamples.Animals;

public class Lion extends Animals {

    Lion(String name){
        this.name=name;
    }
    void roar(){
        System.out.println(name+" is roaring ");
    }
}
