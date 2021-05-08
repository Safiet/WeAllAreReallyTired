package com.class31.Homework;

import java.util.LinkedHashSet;
import java.util.Set;

public class Homework5 {
    /*Task 5
    Create the collection that will store single uniques Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.
       */
    public static void main(String[] args) {
        Set<String>list=new LinkedHashSet<>();
        list.add("Work");
        list.add(" smart");
        list.add(" not");
        list.add(" hard");

        String str2="";

        for(String str:list){
            str2+=str;
        }
        System.out.println(str2);
    }
}
