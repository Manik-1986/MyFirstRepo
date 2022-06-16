package array;


import java.util.ArrayList;
import java.util.Locale;

public class ArrayPractic {
    public static void main(String[] args) {


        ArrayList<String> country = new ArrayList<>();
        country.add("russia");
        country.add("china");
        country.add("japan");
        country.add("kyrgyzstan");
        country.add("france");
        country.add("spain");


        System.out.println(country);
        System.out.println(country.remove(2));
        System.out.println(country);
        for(int i= 0; i<country.size();i++){

            String box = country.get(i);
            System.out.println(box.toUpperCase());
        }





    }

}
