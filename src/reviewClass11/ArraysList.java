package reviewClass11;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArraysList {
    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();

        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Virginia");
        cities.add("Palm Beach");
        cities.add("Casablanca");

        ListIterator<String> stringListIterator = cities.listIterator();



    }
}
