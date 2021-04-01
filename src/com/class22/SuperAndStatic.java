package com.class22;

public class SuperAndStatic {
    String color;
    static void printInf(){
        // System.out.println(color);---> Its will give us error because cant be used with Static
        //color="asfafasfg"; ---> its will be CE error
        // super.color="asfafasfg"; ---> its will be CE error
    }

    public static void main(String[] args) {
        SuperAndStatic superAndStatic=new SuperAndStatic();
        superAndStatic.color="red";
        SuperAndStatic superAndStatic1=new SuperAndStatic();
        superAndStatic.color="White";
        SuperAndStatic superAndStatic2=new SuperAndStatic();
        superAndStatic.color="Black";
        SuperAndStatic.printInf();

    }

}
class parent{
    String color;
}
