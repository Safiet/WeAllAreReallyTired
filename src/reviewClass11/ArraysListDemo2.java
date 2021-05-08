package reviewClass11;

import java.util.ArrayList;
import java.util.List;

public class ArraysListDemo2 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("virginia");
        cities.add("Palm Beach");
        cities.add("Casablanca");
        int index= cities.indexOf("virginia");
        cities.add(index+1,"Newyork");
        cities.add(0,"Alexandria");
        cities.add(0,"Safiet");

        System.out.println(cities);
        System.out.println(cities.size());
        System.out.println(cities.indexOf("Chicago"));
        System.out.println(cities.lastIndexOf("Chicago"));
        System.out.println(cities.set(0,"Chicago"));
        System.out.println(cities);
        System.out.println(cities.remove("Chicago"));
        System.out.println(cities);
        int firstIndex=2;
        int lastIndex=4;
        System.out.println("------subList-------");
        ArrayList<String> limitedCities = (ArrayList<String>)cities.subList(0,1);
        //ArrayList<String> limitedCities1 = new ArrayList<>();
        System.out.println(limitedCities);
        System.out.println(limitedCities);



    }
}
