package com.class30.Recap.Tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects1=new ArrayList<>();
        subjects1.add("SDLC");
        subjects1.add("Manual Testing");
        subjects1.add("Java");
        subjects1.add("TestNG");
        Iterator<String> iterator=subjects1.iterator();
        System.out.println(subjects1);
        while(iterator.hasNext()){
            String var=iterator.next();
            if(var.length()>4){
                iterator.remove();}

        }
        System.out.println(subjects1);

    }
}
