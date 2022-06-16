package Scanner_;
import java.util.Scanner;

public class Aibek1 {
    public static void main(String[] args) {


        String china = "китайская";
        String dunganskaya = "дунганская";
        String kyrgyz = "кыргызская";

        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите кухню");
        System.out.println("1" + china + "\n" + "2" + dunganskaya + "\n" + "3" + kyrgyz);
        int input = scan.nextInt();

        if (input == 1) {
            System.out.println("Pekinskaya Utka");
            System.out.println("Выберите Блюда");
            String input2 = scan.next();
            if (input2.equals("Pampushka")) {
                System.out.println("Ваша Пампушка готовится");

            } else {
                System.out.println("Нет такого блюда");
            }
        }
        if (input == 2) {
            System.out.println("Welcome to Dunganskaya kuhnya");
            System.out.println("Выберите Блюда");
            String input2 = scan.next();
            if (input2.equals("Ashlyanfu")) {
                System.out.println("Ваш Ашлянфу готовится");
            } else {
                System.out.println("Нет такого блюда");
            }

        }
        if (input == 3) {
            System.out.println("Welcome to Supara");
            System.out.println("Выберите Блюда");
            String input2 = scan.next();
            if (input2.equals("BeshBarmak")) {
                System.out.println("Ваш Бешбармак готовится");
            } else {
                System.out.println("Нет такого блюда");
            }
        }
        if (input >= 4) {
            System.out.println("Нет такой кухни");
        }
    }

}
