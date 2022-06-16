public class DataTypes {
    public static void main (String []args){


        // Primitive data types
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 123456789;
        long num4 = 123567889979877789l;
        float num5 = 78.98f;
        double num6 = 78.23;

        char symbol1 = 'j';
        char symbol2 = 'y';
        char symbol3 = 65;

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(bool1);
        System.out.println(symbol1);
        System.out.println(symbol2);
        System.out.println(symbol3);

        //                  127 +  J  +    78.23
        //                  127 +  106( ASCII code "J" +  78.23
        System.out.println(num1 + symbol1 + num6);
        System.out.println(num1 + " " + symbol1 + " " + num6);
                        //  78.98        true
        System.out.println(num5 + " " + bool1);

        // Non primitive data types



        String car = "BMW";
        String flower = "rose";

        System.out.println(car);


        //


    }
}
