package java_operators;

public class Draft2 {
    public static void main(String[] args) {
        //              012345678901234567890
        String fraze = "I believe, I can fly!";
        System.out.println(fraze.charAt(3));
        System.out.println(fraze.substring(8,9));
        System.out.println(fraze.indexOf('I', 9));
        System.out.println(fraze.substring(10, 20));
        System.out.println(fraze.replace(',', '!'));
        System.out.println(fraze.substring(17,20).toUpperCase());

        System.out.println("By Elvira");

        System.out.println(fraze.substring(11, 21).concat(fraze.substring(0, 10)));

        System.out.println("___________");

        System.out.println(fraze.replace("I believe","I can fly").concat(" ").concat("I believe"));

        System.out.println("___________");

        String name = "I believe, I can fly";
        System.out.println(name.substring(0,10).replace("I believe", "I can fly") +
                " " + name.substring(0,9));



    }
}
