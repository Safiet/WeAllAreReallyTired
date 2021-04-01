package com.class22.MethodOverLoading;

public class MethodOverLoadingDemo {
    void add(int a , int b){
        System.out.println(a+b);
    }
    void addDouble(double a , double b){
        System.out.println(a+b);
    }
    void addArrays(int[] arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }System.out.println(sum);
    }void addThreeNumbers(int a,int b,int c) {
        System.out.println(a + b + c);
    }



    public static void main(String[] args) {
        MethodOverLoadingDemo obj=new MethodOverLoadingDemo();
        obj.add(10,20);
        obj.addThreeNumbers(10,20 ,30);
        int[] arr={10,10,10};
        obj.addDouble(10.5,20);
        System.out.println(10);
        System.out.println(10.0);
        System.out.println("10");
}}
