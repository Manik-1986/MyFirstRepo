package java_operators;

import java.util.Scanner;

public class Draft1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String china ="китайская";
        String dungan = "дунганская";
        String kyrgyz = "кыргызская";

        String chinaFood = "Pampushki";
        String dunganFood = "Ashlyanfu";
        String kyrgyzFood = "BeshBarmak";


        System.out.println( "Выберите из трех видов кухни");

        System.out.println("1 " + china +  "\n" + "2" + dungan + "\n" + "3" + kyrgyz);

        String input = scanner.next();
        String inputFood = scanner.next();
        if(input.equals(china)) {
            System.out.println(" Welcome to \" Pekinskaya utka\"");
            if (inputFood.equals("Pampushki")) {
                System.out.println(chinaFood + " ordered");
            } else {
                System.out.println("Net v meny");
            }
        }
        else if(input.equals(dungan)){
            System.out.println(" Welcome to \"Dopandgi\" ");
            if(inputFood.equals("Ashlyanfu")){
                System.out.println(dunganFood + " ordered");
            }
            else {
                System.out.println("Net v meny");
            }
        }
        else if(input.equals(kyrgyz)){
            System.out.println(" Welcome to \"Supara\" ");
            if(inputFood.equals("BeshBarmak")){
                System.out.println(kyrgyzFood + " ordered");
            }
            else{
                System.out.println("Net v meny");
            }
        }
        else {
            System.err.println("Pojaluyst, vyberite iz treh predlogennih");

        }
        //optinal




    }
}
