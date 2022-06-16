package maps;

import java.util.*;

public class Map2 {
    public static void main(String[] args) {
        Map<String, String>  cities = new HashMap<>();
        cities.put("China", "Beijing");
        cities.put("UK", "London");
        cities.put("USA", "DC Washington");
        cities.put("UEA","Abu-Dhabi");
        cities.put("Kyrgyzstan","Bishkek");
        cities.put("France", "Paris");
        System.out.println(cities);
        System.out.println(cities.entrySet());
        System.out.println(cities.keySet());
        System.out.println(cities.values());

         Iterator<Map.Entry<String,String >> itr = cities.entrySet().iterator();
         while (itr.hasNext()){
             Map.Entry<String,String> entry = itr.next();
             System.out.println("Keys: " + entry.getKey() + "\t\t\tValues: " + entry.getValue());
         }
        System.out.println("-----------------");
         Map<String, String> cities2 = new TreeMap<>(cities);
         for(String keys: cities2.keySet()){
             System.out.print(keys);
         }
        System.out.println("____________________");
        Map<String, String> cities3 = new TreeMap<>(cities);
        for(String values: cities2.values()) {
            System.out.print(values);
        }
        LinkedHashMap<String, String> cities4 = new LinkedHashMap<>(cities);
        for(Map.Entry<String, String> keysAndValues : cities3.entrySet()){
            System.out.println("Keys: " + keysAndValues.getKey() + " " + " \t \tValues: " + keysAndValues.getValue());
        }









//        List<String> month = new ArrayList<>(Arrays.asList("January","February","March","April", "May", "June", "July"));
//
//        Iterator itr1 = month.iterator();
//        while(itr1.hasNext()){
//            System.out.println(itr1.next());}


    }
}
