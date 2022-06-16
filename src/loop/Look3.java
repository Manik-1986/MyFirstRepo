package loop;

import java.util.Scanner;

public class Look3 {
    public static void main(String[] args) {
        //Задание сортировка по алфавиту
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        char c;
        for (c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {

                    System.out.print(str.charAt(i) + "");
                }
            }
        }
    }
}


