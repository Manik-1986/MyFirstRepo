import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorPractic {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        Iterator itr = list.iterator();;
//        list.set(0,"five");

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("____________");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        Iterator itr1 = list.iterator();
        list.set(0,"five");
        System.out.println(itr1.next());



    }
}
