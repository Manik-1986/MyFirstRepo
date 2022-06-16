package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        numbers[0] =392;
        numbers[1] = 7;
        numbers[2] = 1000;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        String [] names = new String[4];
        names[0] = "Doha";
        names[1] = "Aida";
        names[2] = "Gulkair";
        names[3] = "Abil";
        names[1] = "Djen";
        System.out.println(Arrays.toString(names));
        System.out.println(names[0] == names[2]);

        StringBuilder [] name = new StringBuilder[3];
        name [0] = new StringBuilder("Kiko");
        name [1] = new StringBuilder("Aza");
        name[2] = new StringBuilder("Islam");
        name [2] = new StringBuilder("LOL");
        System.out.println(Arrays.toString(name));





    }
}
