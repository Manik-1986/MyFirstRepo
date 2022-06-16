package maps;

import java.sql.Array;
import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        HashMap <Integer, String> numName = new HashMap<>();
        numName.put(0, "Mairam");
        numName.put(4, "Ermek");
        numName.put(1, "Mai");

        numName.put(3, "Zara");
        numName.put(2, "Esen");
        numName.put(-1, "Kairat");
        numName.put(-5, "Isa");
        numName.put(10, "Aza");
        numName.put(-100, "Mairam");
        System.out.println(numName);

        TreeMap<String, Integer> codeNumsOfContries = new TreeMap<>();
        codeNumsOfContries.put("Bishkek", 312);
        codeNumsOfContries.put("Tajikiston", 922);
        codeNumsOfContries.put("Russia", 7);
        codeNumsOfContries.put("Karakol", 3922);

        codeNumsOfContries.put("Karakol", 3922);
        codeNumsOfContries.put("France", 33);
        System.out.println(codeNumsOfContries);
        System.out.println(codeNumsOfContries.get("Karakol"));
        System.out.println(codeNumsOfContries.keySet());
        System.out.println(codeNumsOfContries.values());

        LinkedHashMap <Integer,Integer> nums = new LinkedHashMap<>();
        nums.put(9,4);
        nums.put(8,4);
        nums.put(5,4);
        nums.put(4,4);
        nums.put(2,4);
        System.out.println(nums);
        System.out.println(nums.get(5));
        System.out.println(nums.keySet());
        System.out.println(nums.values());
        System.out.println(nums.size());

        LinkedHashMap<String, String> fullNames= new LinkedHashMap<>();
        fullNames.put("Ibraev", "Aza");
        fullNames.put("Kerimbekov", "Azam");
        fullNames.put("Sadykov", "Azama");
        fullNames.put("Imangaziev", "Azamat");
        System.out.println(fullNames.remove("Ibraev"));
        System.out.println(fullNames.remove("Kerimbekov", "Aza"));
        System.out.println(fullNames);
        fullNames.clear();





       int j= 0;
        String names1 [] = new String[fullNames.size()];
        Iterator itr = fullNames.values().iterator();
        while (itr.hasNext()){
            names1[j]=(String) itr.next();
            j++;

        }
        System.out.println(Arrays.toString(names1));
//
//        List<String>names2 = new ArrayList<>();
//        Iterator itr1 = fullNames.keySet().iterator();
//        while (itr1.hasNext()){
//            names2.add((String) itr.next());
//        }
//        System.out.println(names2);


    }
}
