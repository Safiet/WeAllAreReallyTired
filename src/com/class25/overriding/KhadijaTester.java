package com.class25.overriding;

public class KhadijaTester {
    public static void main(String[] args) {
        Object[] arr={new String("Test"),new Khadija("kdsd")}; //Parent class of all classes thar can exist in java.
       /* KFather obj1=new Ozoda("Ozoda");
        obj1.eat();
        obj1.sleep();*/
        //executeAllMethods(new KFather("Mirza"),new Ozoda("Ozoda"),new Khadija("Khadija"));
    KFather[] kFatherArr= {new KFather("Mirza"), new Ozoda("Ozoda"), new Khadija("Khadija")};
    executeAllMethods(kFatherArr);


    KFather obj1=new Ozoda("Ozoda");
    obj1.sleep();
    KFather obj2=new Khadija("Khadija");
    obj2.sleep();
    }

    static void executeAllMethods(KFather kFather,Ozoda ozoda,Khadija khadija){
        kFather.eat();
        kFather.sleep();
        ozoda.eat();
        ozoda.sleep();
        khadija.eat();
        khadija.sleep();
    }
    static void executeAllMethods(KFather[] kFatherArr){
        for(KFather kFather:kFatherArr){
            kFather.sleep();
            kFather.eat();
        }
    }
}
