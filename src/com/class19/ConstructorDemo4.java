package com.class19;

public class ConstructorDemo4
{
    String name;
    ConstructorDemo4(){
        System.out.println("Empty parametr constructor");
    }
    ConstructorDemo4(String name){
                System.out.println(" paramterized constructor");
    }
    void printName(){
        System.out.println("Ayoub");
    }
    public static void main(String[] args) {
        ConstructorDemo4 obj=new ConstructorDemo4();

        new ConstructorDemo4("Alec");
        obj.printInfo();
    }
void printInfo(){
        printName();
    System.out.println(name);
}


}
