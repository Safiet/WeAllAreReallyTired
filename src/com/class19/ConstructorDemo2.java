package com.class19;

public class ConstructorDemo2 {

    double bonus;
    double sallary;
    String name;

    ConstructorDemo2(String name){
        bonus=50000;
        sallary=50000;
        this.name=name;
         }

    public static void main(String[] args) {
        ConstructorDemo2 obj=new ConstructorDemo2("Ram");

        System.out.println(obj.bonus);
        System.out.println(obj.sallary);
        System.out.println(obj.name);


    }

}
