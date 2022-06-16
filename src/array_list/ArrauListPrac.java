package array_list;

import java.util.*;

public class ArrauListPrac {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add("KARAKOL");
        city.add("Bishkek");
        city.add("KUBA");
        city.add("NARYN");
        System.out.println(city);

        for(int i=city.size()-1;i<=0; i++){
            String small = city.get(i);
            System.out.println(small.toLowerCase());
        }


        ArrayList<String> lands =new ArrayList<>();
        lands.add("Java");
        lands.add("Phyron");
        lands.add("Ruby");
        lands.add("GO");
        lands.add("C");
        lands.add("Swift");

        List<String> lands2 = new LinkedList<>();
        lands2.add("JavaScript");
        lands2.add("PHP");
        lands2.add("Kotlin");

        LinkedList lands3 = new LinkedList<>(lands2);
        lands3.add(0,lands);// присвоили в  lands3 все значения lands
        lands3.add("C#");

        System.out.println(lands3);




    }
}
