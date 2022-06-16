import java.util.Arrays;

public class Draft {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c=4;
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if(ab == 10 || bc == 10 || ac == 10){
            System.out.println(10);
        }
        if(Math.abs(ab - bc) >= 10 || Math.abs(ab - ac) >= 10){
            System.out.println(5);
        }
        System.out.println(0);
        System.out.println(Math.abs(ab - bc));
    }




}
























