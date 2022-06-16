package sets;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.TreeSet;

public class HashSet1HomeWork {
    public static void main(String[] args) {

        TreeSet<String> color = new TreeSet<>();
        color.add("Blue");
        color.add("White");
        color.add("Green");
        color.add("Black");
        color.add("Red");

        String[]myArray = color.toArray(new String[color.size()]);
        for(String s: myArray){
            System.out.println(s);
        }
        System.out.println(Arrays.toString(myArray));


    }
}
