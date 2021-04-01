package com.class22.MethodOverLoading;

public class MethodOverLoadingDemo2 {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,double b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(double a, int b,int c){
        System.out.println(a+b+c);
    }
    void add(int ... arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }System.out.println(sum);}

    public static void main(String[] args) {
        MethodOverLoadingDemo2 obj2=new MethodOverLoadingDemo2();
        int[] arr={10,12,13,12,325,34};
        obj2.add(arr);
        obj2.add(10,10);
        obj2.add(10,10.0);
        obj2.add(10.0,10);
        obj2.add(10.0,10,10);

    }


}
