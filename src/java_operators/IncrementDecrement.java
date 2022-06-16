package java_operators;

public class IncrementDecrement {
    public static void main(String[] args) {

        // increment & decrement

        // increment (++) --> postfix
        int num1 = 1;
        num1++;
        num1++;
        num1++;


        System.out.println("num1 -> " + num1++);  //4
        System.out.println(num1);

        // increment ---> prefix
        int num2 = 1;
        ++num2;
        ++num2;
        ++num2;
        System.out.println("num2 -> " + ++num2); //5
        System.out.println(num2);


        //decrement --> postfix
        int num3 = 5;
        num3--;
        num3--;

        System.out.println("num3 --> " + num3--);
        System.out.println(num3);

        // decrement --->  prefix
        int num4 = 5;
        --num4;
        System.out.println("num4 --> " + --num4);
        System.out.println(num4);

        int f = 7;
        int b = f++;
        System.out.println(b);







    }
}
