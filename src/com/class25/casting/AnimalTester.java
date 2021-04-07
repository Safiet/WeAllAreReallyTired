package com.class25.casting;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.eat();
        animal.sleep();

        Cat cat=(Cat) animal;


    }
}
