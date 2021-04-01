package com.class23.overriding;

public class Azizi {
    void marry(){
        System.out.println("My Boy will marry the girl that me and my wife will  "+" choose for him");
    }
}
class Son1 extends Azizi{

}
class Son2 extends Azizi{
    void marry(){
        System.out.println(" I want to marry taylor swift");
    }

    public static void main(String[] args) {
        Son2 son=new Son2();
        son.marry();
        Son1 son2=new Son1();
        son2.marry();
    }


}
