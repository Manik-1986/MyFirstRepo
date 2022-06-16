package loop;

import java.util.Scanner;

public class Look2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // цифры для начала цикла
    int num = scan.nextInt();
    int num2 = scan.nextInt();
    int n=0;
     for (int i = num; i < num2; i++){
         if (i % 2 > 0){
             n=n+1;
             //System.out.print();
         }
//

     }
        System.out.println(n);



    }
}
