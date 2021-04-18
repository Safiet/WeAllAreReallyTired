package com.class28.interfaces;

public interface IParent {
    // private int number=10; --> CE because all variables in interfaces are public;
    public static final int number = 10; // No need to make the variables as public static and final because they are already have that
    int number2 = 20;
   /* Iparent(){
   }
    */ // Interface cant have a constructors because they dont

void method1();}
interface IParent2{
    void method2();
}
class AdvanceChild implements IParent,IParent2{
    @Override
     public void method1(){
        System.out.println("from Parent");

    }
    public void method2(){
        System.out.println("Iparent2");
    }

}
