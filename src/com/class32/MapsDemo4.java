package com.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapsDemo4 {
    public static void main(String[] args) {

    LinkedHashMap<String,Double> items=new LinkedHashMap<>();
        items.put("soap",5.2);
        items.put("shirt",14.5);
        items.put("pillow",236.2);
        items.put("blanket",9.2);
        Collection <Double> values=items.values();
        Iterator<Double> iterator=values.iterator();
        while(iterator.hasNext()){
            Double price=iterator.next();
            if(price>10){
                iterator.remove();
            }

        }
        System.out.println(items);


    }}
