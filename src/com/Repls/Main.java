package com.Repls;


import java.util.LinkedList;

public class Main {
        public static void main(String[] args) {
            LinkedList<Integer> mylist = new LinkedList<>();

            int a = 0, b = 0, c = 1; int n=10;
            for(int i = 1; i <= n; i++) {
                a = b;
                b = c;
                c = a + b;
                mylist.add(a);
            }
               for(Integer x : mylist){
                   System.out.print(x+" ");
               }


}}

