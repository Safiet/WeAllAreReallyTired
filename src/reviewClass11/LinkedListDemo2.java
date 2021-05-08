package reviewClass11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> cities=new LinkedList<>();

        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Virginia");
        cities.add("Palm Beach");
        cities.add("Casablanca");
//        cities.remove("Chicago");
//        System.out.println(cities.getFirst());
//        System.out.println(cities.getLast());
        Iterator<String> iterator=cities.descendingIterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }
        System.out.println(cities);




    }
}
