package com.class23.overriding;

public class test {
    public static void main(String[] args) {
        System.out.println("main from the parent");
    }
}
class Child1 extends test {
    /*public static void main(String[] args) {
        System.out.println("Main from the Child");
    }*/
}
class Child2{
    public static void main(String[] args) {
        String [] args1={"hi"};
        Child1.main(args1);

}
}
