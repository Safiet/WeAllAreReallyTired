package com.class30.Recap.Tasks;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> subjects1=new ArrayList<>();
        subjects1.add("SDLC");
        subjects1.add("Manual Testing");
        subjects1.add("Java");
        subjects1.add("Git");
        subjects1.add("Selenium");
        subjects1.add("TestNG");
        System.out.println(subjects1);

       Iterator<String> iterator=subjects1.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(subjects1);
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(subjects1);
        iterator=subjects1.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(subjects1);
       // System.out.println(iterator.next());


    }
}
