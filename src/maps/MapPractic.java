package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapPractic {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(90,"Azamat");// 80-100 A, 60-70-B, 40-59-C, 10-4--D
        students.put(80, "Asel");
        students.put(76,"Diana");
        students.put(0,"Aibek");
        students.put(98,"Ema");
        students.put(35,"Zara");
        int points = 0;
        Iterator itr = students.keySet().iterator();
        while (itr.hasNext()){

            if(points <= 100 && points >= 80){
                System.out.println(students.get(points)+ " " + "A");
            }

//            else if (points <= 70 && points >= 60){
//                System.out.println(students.get(points)+ " " + "B");
//        }
//            else if (points <= 59 && points >= 40) {
//                System.out.println(students.get(points) + " " + "C");
//            }
//            else if (points <= 10 && points >= 4) {
//                System.out.println(students.get(points) + " " + "D");
//            }
//            else {
//                System.out.println(" Get grade F");
//            }





    }
}}
