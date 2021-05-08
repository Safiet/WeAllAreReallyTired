package com.class30.Recap.Tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=1;i<=50;i++){
            if(i%2==0){
                numbers.add(i);
            }
        }
        System.out.println(numbers);
        Iterator <Integer> iterator=numbers.iterator();
        while(iterator.hasNext()){
            Integer number=iterator.next();
            if(number%5==0){
                iterator.remove();
            }
        }System.out.println(numbers);

    }
}
