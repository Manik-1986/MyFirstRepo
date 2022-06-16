package array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Almaz");
        al.add("Merim");
        al.add("Samat");
        al.add("Kairat");
        al.add("Gulkair");
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.set(0, "Bolot"));
        System.out.println(al);

        String[] names = new String[al.size()];

        for (int i = 0; i < al.size(); i++){ ;
        names[i] = al.get(i);
        System.out.println(names[i]);
    }
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Maxs");
        al2.add("Mirbek");
        al2.add("Nazira");
        al2.add(2,"Kyal");
        al.addAll(al);
        System.out.println(al2);
        al2.addAll(al);
        System.out.println(al2);
        System.out.println(al2.set(4, "Doha"));  // Bolot
        System.out.println(al2);

        al2.remove("Kyal");
        al2.clear();
        System.out.println(al2);
        System.out.println("_________");
        System.out.println(al2);




    }
}
