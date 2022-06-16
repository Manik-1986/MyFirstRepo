package Scanner_;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Java biblioteka


        // novie obekty vyzivaem cherez "new"
        Scanner scanner = new Scanner(System.in);
  //      String login = scanner.next();
   //     System.out.println("My Login is " + login);

//        int password = scanner.nextInt();
  //      System.out.println("My password is " + password);

 //       boolean bool = scanner.nextBoolean();
 //       System.out.println("This is " + bool);


        // nextline zapuskaet vsu stroku
  //      String word = scanner.nextLine();
  //      System.out.println(" Words is " + word);

        Scanner scan = new Scanner(System.in);
        String input = "Войти в аккаунт";
        System.out.println(input);
        String login = scan.nextLine();


        System.out.println("Введите пароль");
        int password = scan.nextInt();












    }
}
