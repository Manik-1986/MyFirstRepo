package HomeWork;

import java.util.Scanner;

public class HomeWork8910 {
    public static void main(String[] args) {

        //number 8
   //     int num = 113;
  //      double num1 = 2.71828d;
  //      String comp = "I am learning a bit about Computer Science";

    //    System.out.println("This room # " + num);
    //    System.out.println("e is close to " +  num1);
      //  System.out.println(comp);

            String login1 = "Diana";
            String password1 = "nana01";

            Scanner scan = new Scanner(System.in);
            System.out.println("Введите логин");
            String flogin = scan.next();

            if ((flogin.equals(login1))){
                System.out.println("Введите пароль");
                String fpassword = scan.next();

                if ((flogin.equals(login1)) && (fpassword.equals(password1)))
                {System.out.println("Добро пожаловать");
                }
                else if ((flogin.equals(login1)) || !(fpassword.equals(password1))){
                    System.err.println("Вы ввели неверный пароль");
                }
                else{
                    System.out.println("Вы ввели неверный логин");
                }

            }







    }
}
