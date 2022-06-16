package JavaMetods;

public class Metods1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Lilly");
        sb.lastIndexOf("l",0);

       sumTwoNumbers();
       multipleoOfTwoNumbers(2, 3 , " years old");



    }
    public static   void sumTwoNumbers(){
       int num1 = 10;
       int num2 = 7;
       System.out.println(num1+num2);}



    public static void multipleoOfTwoNumbers(int num1,int num2, String str){
        System.out.println(num1*num2+str);
    }

}
