package com.class31.Homework;

/*
                                        Task4
  Create a Map that will store Employee name and salary.
  Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
  John Smith=$100000
*/


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HomeWork4 {
    public static void main(String[] args) {
        double max=0;
        String str1="";
        Map<String,Double> employees=new HashMap<>();
        employees.put("Safiet",213080.0);
        employees.put("Alyona",74221.0);
        employees.put("Edem",12452.0);
        employees.put("Evelina",20009.0);

        Set<String> emp= employees.keySet();
        Iterator<String> iterator = emp.iterator();
        while(iterator.hasNext()){
            String str= iterator.next();
            Double salary1=employees.get(str);
            if(salary1>max){
                max=salary1;
                str1=str;
            }
        }
        System.out.println(str1+"=$"+max);


    }
}
