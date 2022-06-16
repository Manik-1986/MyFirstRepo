package sets;

import java.util.*;

public class HachSets1{
    public static void main(String[] args) {
        HashSet<String> sets1 = new HashSet<>();
        sets1.add("Kate");
        sets1.add("Tim");
        sets1.add("Steve");
        sets1.add("James");
        sets1.add("Alex");
        sets1.add("Clark");

        System.out.println(sets1);
        sets1.add("Will");
        System.out.println(sets1);
        sets1.add("Steve");
        System.out.println(sets1);
        //LinkedHashSet
        LinkedHashSet<String> LinkedHashSet1 = new LinkedHashSet<>(sets1);
        LinkedHashSet1.add("Aidos");
        LinkedHashSet1.add("Aiperi");
        LinkedHashSet1.add("Bekzat");
        LinkedHashSet1.add("Arstanbek");
        LinkedHashSet1.add("Asan");
        System.out.println(LinkedHashSet1);
        LinkedHashSet1.add("Aida");// выводит в натуральном  порядке
        System.out.println(LinkedHashSet1);
        LinkedHashSet1.add("Bekzat");// не работает с дубликатом, игнорирует
        System.out.println(LinkedHashSet1);

        boolean compare = sets1.equals(LinkedHashSet1);
        System.out.println(compare);

        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Isa");
        treeSet1.add("Bahtiyar");
        treeSet1.add("&");
        treeSet1.add("Bolot");
        treeSet1.add("124");
        System.out.println( treeSet1);


        Set<String> set2 = new HashSet<>();
        Set<Integer> set3 = new LinkedHashSet<>();
        Set<String> set4 = new TreeSet<>();
        Set symbols = new TreeSet<>();
        symbols.add('u');
        symbols.add('Y');
        symbols.add('L');
        symbols.add('+');
        symbols.add('E');
        symbols.add('u');
        symbols.add('y');
//        System.out.println(symbols);

        Iterator itr = symbols.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());}

            Set sets5 =new LinkedHashSet();
            sets5.add(23.6);
            sets5.add(45);
            sets5.add('y');
            sets5.add("word");
            sets5.add('i');
            sets5.add('&');
            sets5.add(8);
            sets5.add(true);
            System.out.println(sets5);

            Set<Integer> numSet = new TreeSet<>();
            numSet.add(365);
        numSet.add(5);
        numSet.add(4);
        numSet.add(78);
        numSet.add(1);
        numSet.add(55);
        numSet.add(55);
        System.out.println(numSet.isEmpty());
        System.out.println(numSet.remove(55));
        System.out.println(numSet);
        System.out.println(numSet.size());

        Iterator iterator2 = numSet.iterator();
        System.out.println(iterator2.next());
        System.out.println(iterator2.next());























    }
}
