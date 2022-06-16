package sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {

       Integer [] arr ={1,2,3,5,7,8};
        Integer [] arr2 = new Integer[arr.length];

        for(int i=0; i<arr.length;i++){
            arr2[i]=arr[i];

        }
        List<Integer> arraysList = Arrays.asList(arr2);
        ArrayList<Integer> al = new ArrayList<Integer>(arraysList);

        System.out.println(arraysList);





    }
}
