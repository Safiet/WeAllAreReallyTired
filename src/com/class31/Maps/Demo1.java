package com.class31.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Azizi");
        arrayList.add("Ram");
        arrayList.add("Danilo");
        arrayList.add("Mile");

        Map<Integer,String> map=new HashMap<>();
        map.put(123456,"Azizi");
        map.put(123457,"Ram");
        map.put(123458,"Danilo");
        map.put(123459,"Mike");

        System.out.println(map.get(123458));

    }}
