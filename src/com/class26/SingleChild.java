package com.class26;

public class SingleChild {
    void method1(){
        System.out.println("bla bla");
    }
}
class Child extends SingleChild{
    @Override
    void method1() {
        System.out.println("Bla Bla from Child");
    }
        void method2(){
            System.out.println("method2");
        }
    }
    class Tester{
        public static void main(String[] args) {
            Child[] child1s = {new Child()};
        }}


