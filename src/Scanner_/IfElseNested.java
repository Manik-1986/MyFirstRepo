package Scanner_;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class IfElseNested {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String china = "китайская";
        String dungan = "дунганская";
        String kyrgyz = "кыргызская";

        String chinaFood = "Pampushki";
        String dunganFood = "Ashlyanfu";
        String kyrgyzFood = "BeshBarmak";

        System.out.println("Выберите из трех предложенных вариантов");
        System.out.println("1" + china + "\n" + "2" + dungan + "\n" + "3" + kyrgyz);

        int input = scan.nextInt();
        String inputFood=scan.next();
        if (input==1) {

            System.out.println("Welcome to Pekinskaya utka");


            if (inputFood.equals("Pampushka")) {
                System.out.println(chinaFood + " Заказан");
            } else {
                System.out.println("Net takogo bluda");
            }
        } else if (input == 2) {
            System.out.println("Welcome to Dunganskaya kuhnya");
            if (inputFood.equals("Ashlyanfu")) {
                System.out.println(dunganFood + "Заказан");
            } else {
                System.out.println("Net takogo bluda");
            }
        } else if (input == 3) {
            System.out.println("Welcome to Supara");
            if (inputFood.equals("BeshBarmak")) {
                System.out.println(kyrgyzFood + "Заказан");
            } else {
                System.out.println("Net takogo bluda");
            }
        }
        else {
            System.err.println("Пожалуйста, сделайте выбор из предложенных выше.");

        }


    }

}
