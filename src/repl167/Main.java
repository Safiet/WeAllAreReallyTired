package repl167;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Boolean> listA=new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);
        ArrayList<Boolean> listB=new ArrayList<>();
        listB=listA;

        Iterator<Boolean> iterator=listB.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }



    }}



