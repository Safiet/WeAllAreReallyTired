package com.class27;

import reviewClass8.Constructors.ConsDemo;

public class Test extends ConsDemo {
    Test() {
        super("name", "add");
       super.address="Test";
        method2();
        method4();
    }
    public static void main(String[] args) {
        ConsDemo obj = new ConsDemo();
        // ConsDemo obj1=new ConsDemo("NOt ALLoweD"); -----> CE can not acces this constructor outside of thge package

    }
}
