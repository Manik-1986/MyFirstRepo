package java_operators;

public class LogicalOperators {
    public static void main(String[] args) {
         //  && logic and
        //                true    false
        boolean logic = 5 == 5 && 7 ==9;
        System.out.println(logic);

        // || logic or
        boolean logic2 = 5 == 5 || 7==9;
        System.out.println(logic2);


            // !() logical not
         //                false    true
        boolean logic3 = !(78 > 23 || 90 > 2);
        System.out.println(logic3);

        boolean logic4 = 4 == 9 || 9 < 8;
        System.out.println(logic4);



    }
}
