package com.class27.demo3;

public interface Test {
    int number=10;
    void display();
    static void method1(){
        System.out.println(" Hi iam a static method");
    }
    default void method2(){
        System.out.println(" I am a default method");
    }
}
