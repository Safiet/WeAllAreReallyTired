package com.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Important code ");
        System.out.println("Important code ");
        System.out.println("Important code ");
        String path="C:\\Users\\des01\\Downloads\\ADSCI_7689453431.xlsx";
        try{
            System.out.println("Inside try block");
        FileInputStream fileInputStream=new FileInputStream(path);
       /* String name=null;
        name.length();*/
    }catch(FileNotFoundException fileNotFoundException){
            System.out.println("Catch block");
            System.out.println("Catch block");
            System.out.println("Catch block");
        }
        System.out.println("Important code after try catch");
        System.out.println("Important code after try catch");
        System.out.println("Important code after try catch");
    }
}
