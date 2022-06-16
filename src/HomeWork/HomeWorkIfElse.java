package HomeWork;

import java.util.Scanner;

public class HomeWorkIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floor = scan.nextInt();
    if( floor == 1){
        System.out.println("Welcome to restaurant");
    }
     else if (floor == 2 ){
        System.out.println("Welcome to GYM");
    }
    else if (floor >= 3 && floor <10 ){
        System.out.println("Welcome to booking service");
    }
    else if (floor == 10){
        System.out.println("Welcome to lookout");
    }
    else {
        System.err.println("invalid");
    }
    }

}
