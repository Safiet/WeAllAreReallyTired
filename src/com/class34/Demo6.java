package com.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo6 {
    public static void main(String[] args) {
        String path="C:\\Users\\des01\\Downloads\\ADSCI_7689453431.xlsx";
        FileInputStream fileInputStream=null;
        // System.out.println(10/0); will be error because that error sout inside ob block
        try {
            fileInputStream=new FileInputStream(path);
            System.out.println("Next line of code");
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(10/0);
            fileNotFoundException.printStackTrace();
        }finally {
            try{
                System.out.println("Will always be executed");
                fileInputStream.close();
            }catch (IOException e){
             e.printStackTrace();
            }
        }
        System.out.println(10/0);
    }
}
