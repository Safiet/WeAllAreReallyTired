package com.class21.SuperWordDemo2;

public class ChildClass extends Parent{


    public ChildClass(int num1, int num2, String name) {
        super(num1, num2, name);
    }

    int average(){
        return super.add()/2;
    }

    int add(){
        return num1+num2-10;
    }
}
