package com.class31.Homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

;

/*Task2
        Create a map of Best Buy store. Place
        item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        Retrieve all keys and values from a Best Buy map using EntrySet.*/
public class Homework2 {
    public static void main(String[] args) {
        Map<Integer, String> bestBuy = new HashMap<>();
        bestBuy.put(98444,"Watch");
        bestBuy.put(134152,"PlayStation");
        bestBuy.put(111112,"Vacuum");
        bestBuy.put(345252,"Phone Case");
        bestBuy.put(444352,"Iphone");

        Set<Map.Entry<Integer,String>> items=bestBuy.entrySet();


        for(Map.Entry<Integer,String> item:items){
            System.out.println(item.getKey()+": "+item.getValue());
        }
        System.out.println("_______________________________________________");
        Iterator<Map.Entry<Integer,String>> iterator= bestBuy.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
        }



    }
}
