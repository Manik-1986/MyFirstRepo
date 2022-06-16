package strings;

import java.util.Locale;

public class StringsMetods {
    public static void main(String[] args) {
        //             012345678
        String name = "Jef Bezos";

        // метод length()
        System.out.println(name.length());

        // metod charAt
        System.out.println(name.charAt(2)); //f

        //.concat() это метод соединения конканизация
        String company =" Amazon";
         System.out.println(name.concat(company));
         //               0123456789012345
         String author = "Chingiz Aitmatov";

         // .subString() данный метод позволяет через индексы показать заданные символы
        System.out.println(author);
        System.out.println(author.substring(13));
        System.out.println(author.substring(8,13));

        String firstName = author.substring(8,14);
        System.out.println(firstName); // Aitmat

        // .trim() данный метод удаляет пробелы перед и за переменной
        //              01234567890
        String space = "  WindowsXS ";
        System.out.println(space);
        System.out.println(space.trim());

        //             0123456789
        String winda ="WindowsXoP";

       // .lastIndex0f() данный метод выводит последний индекс заданного символа
        System.out.println(winda.lastIndexOf('n'));// 8

        // .equals() данный метод сравниваеи и выводит true or false
        String flower = "OrchiD";
        String flower2 = "ORchid";
        System.out.println(flower.equals(flower2));

        //. equalsIgnoreCase  данный метод в сравнении игнарирует регистры символа
        System.out.println(flower.equalsIgnoreCase(flower2));

        // .tolowerCase() данный метод преврашяет все символы в написании в маленький регистр
        String state = "CALIfORNiA";
        System.out.println(state.toLowerCase());

        // .toUpperCase() данный метод преврашает все символы в написании в верхний регистр
        System.out.println(state.toUpperCase());

        String country = "USA Unit";
        System.out.println(country.replace('S', 'C')); /* replace с помощью этого метода можно заменить
        символ в переменной на новыйю */

        String country2 = "United States of Americates";
        System.out.println(country2);
        System.out.println(country2.replace("tes", "OOFF")); /* c помощью того метода можно поменять
        отрезок слов на новый*/

        System.out.println(country.replaceAll("USA", "Unit") +" \b" + "\b" + country.replaceAll( "Unit", "USA")); /* c помощью данного метода
        можно поменять ранее заданную переменную на новое.*/



    }
}