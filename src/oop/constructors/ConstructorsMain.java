package oop.constructors;

public class ConstructorsMain {
    public static void main(String[] args) {
        Constructor1 bugatti = new Constructor1();
        bugatti.mark = "Bugatti";
        bugatti.model = "Chiron";
        bugatti.color = "Black";
        bugatti.wheel = 4;
        bugatti.volume = 8;
        bugatti.years = 2022;


        bugatti.getInfo();

        Constructor2 ferrari = new Constructor2("Ferrari", "La Ferrar812","Red",8.0,2022,4);
        System.out.println(ferrari.mark + " " + ferrari.model );

        System.out.println(ferrari.driving());

        Constructor2 tesla = new Constructor2("tesla", "344",2018);

        System.out.println(tesla.mark);
    }
}
