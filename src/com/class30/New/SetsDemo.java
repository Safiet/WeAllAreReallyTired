package com.class30.New;

import java.util.*;

public class SetsDemo {
    public static void main(String[] args) {
        Set<String> names=new HashSet<>();
        names.add("Z");
        names.add("G");
        names.add("J");
        names.add("F");
        names.add("A");
        names.add("T");
        ArrayList<String> listfromSet=new ArrayList<>(names);
        System.out.println(names);
        for(String name:names){
            System.out.println(name);
        }for(int i=0; i<names.size();i++){

        }
    }
}
