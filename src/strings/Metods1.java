package strings;

import java.util.Scanner;

public class Metods1 {
    public static void main(String[] args) {
        String login = "Manik";
        String pasword = "rose";
        Scanner scaner = new Scanner(System.in);

        System.out.println("Введите логин");
        String input = scaner.nextLine();

        if (input.equals(login) ) {

            System.out.println("Введите пароль");


        }
        else{

            System.err.println("Invalid");
            }
        String pas = scaner.nextLine();

        if (pasword.equals(pas)) {

            System.out.println("Wellcome");
        }
        else{
            System.err.println("Invalid");{

            }

        }


        }








}
