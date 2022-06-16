import java.util.Scanner;

public class SecondClass {

    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String k ="red";
        String f = "blue";
        String result;


        String i = str.substring(0,3);
        String s = str.substring(0,4);
        if (str.length()>=4) {
            if (i.equals(k)) {
                result = "red";
                System.out.println(result);
            }
              else if(s.equals(f))
            {
                result = "blue";
                System.out.println(result);
            }


               else{
                result = "";
                System.out.println(result);

            }
        }














    }
}
