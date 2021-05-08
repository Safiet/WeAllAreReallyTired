package com.class34;

import com.class14.Calculator;

public class Demo7 {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
       try {
           calculator.Calculate();

       }catch (ArithmeticException e){
        System.out.println("Can not divide by zero");

       }
    catch (NullPointerException e){
        System.out.println(" Null object");
    }catch(Exception e){
           System.out.println("Generic exception");
       }
    }
}
