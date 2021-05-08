package com.class31.Homework;

import java.util.ArrayList;

/* Task 6

Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers

*/
public class HomeWork6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(100);
        numbers.add(124);
        numbers.add(1356);
        numbers.add(10220);
        numbers.add(10);
        numbers.add(102350);
        numbers.add(100);
        numbers.add(124);
        int sum=0;
        for(Integer num:numbers){
            sum+=num;
        }
        System.out.println("Sum = "+sum);

    }
}
