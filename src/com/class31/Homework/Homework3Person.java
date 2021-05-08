package com.class31.Homework;

/*Task3
Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
 */

import java.util.Map;
import java.util.Set;

public class Homework3Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;


    Homework3Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public static void display(Map<String,Homework3Person> employees){
        Set<String> employee=employees.keySet();
        for(String key: employee){
            System.out.println(key+": "+employees.get(key));
        }
    }
    public String toString(){
        return "Name = "+name+" LastName = "+lastName+" Age = "+age+" Salary = "+salary;
    }
}
