package strings;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {

        String word = "Hi";

        String word2 = new String("Hi");

        System.out.println(word + "\n" + word2);

        Scanner input = new Scanner(System.in);
       // String name = input.nextline();

        //             0123 --> indexs starts with 0
        String str1 = "Rose";
        //             1234 ---> Length

        System.out.println(str1.indexOf('s')); // 2
        System.out.println(str1.indexOf("ose")); // 1

        //               012345678901
        String laptop = "Pro Mac BoProok Pro";
      //  System.out.println(laptop.indexOf("Book"));
      //  System.out.println(laptop.indexOf( '0', 6)); //6
        System.out.println(laptop.indexOf("Pro", 4)); // 10
        System.out.println(laptop.indexOf("Mac")); //4
        /*если нам нужно вывести индекс всех букв в слове мы используем метод ниже, обязательно нужно ставить пробел
        между запросами индексов   cancantination */
                         // буква О находится в 9 индексе                        здесь индекс 12
        System.out.println(laptop.indexOf('o', 7) + " " + laptop.indexOf('o', 12) );












    }
}
