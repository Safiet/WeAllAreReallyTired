package com.class31.Homework;

import java.util.Map;
import java.util.TreeMap;

public class Homework3PersonTester {
    public static void main(String[] args) {
        Map<String,Homework3Person> employees=new TreeMap<>();
        employees.put("ID0123456",new Homework3Person("Safiet","Dzhem",29,200000));
        employees.put("ID0134567",new Homework3Person("Alyona","Uhr",24,78000));
        employees.put("ID0346342",new Homework3Person("Edem","Naf",20,123452));
        employees.put("ID0235235",new Homework3Person("Evelina","Mamut",19,56888));

        Homework3Person.display(employees);

    }
}
