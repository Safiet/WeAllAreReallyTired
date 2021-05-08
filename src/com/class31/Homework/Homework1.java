package com.class31.Homework;

/*Task 1
      Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.*/

import java.util.*;

public class Homework1 {
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap();

        countries.put("Russia", "Moscow");
        countries.put("USA", "Washington DC");
        countries.put("Mexico", "Mexico city");
        countries.put("Poland", "Warsaw");
        countries.put("Ukraine", "Kiev");
        System.out.println("___________Printing Keys +Values using for loop using Set because we need to get keys___________________________");
        Set<String> mapCountries = countries.keySet();
        for (String key : mapCountries) {
            System.out.println(key + ": " + countries.get(key));
        }
        System.out.println("___________Printing Keys +Values using Iterator___________________________");

        Iterator<String> iterator = mapCountries.iterator();
        while (iterator.hasNext()) {
            String country = iterator.next();
            System.out.println((country + ": " + countries.get(country)));
        }

        System.out.println("____________________________________________");

        Set<Map.Entry<String,String>> set=countries.entrySet();

        for(Map.Entry<String,String> country:set){
            System.out.println(country.getKey()+": "+country.getValue());
        }

        System.out.println("_____________Printing values using for loop using Collection becuase we neeed the value_______________________________");
        Collection<String> values = countries.values();
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println("_________Printing Values using Iterator_____________________________");

        Iterator<String> iterator1 =values.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        }





    }
