package sets;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerToArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num1 = scan.nextInt();

        int [][] nun = new int[num][num1];
        ArrayList<Integer>  nun1 = new ArrayList<>();
        nun1.add(3);
        nun1.add(4);
        nun1.add(5);
        nun1.add(6);
        nun1.add(7);
        nun1.add(8);

        if (num == 2) {
            if (num1 == 3) {
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {


                    System.out.println(nun[i][j]+ " ");
                }}
            }
        }
        System.out.println(nun1);



    }
}
