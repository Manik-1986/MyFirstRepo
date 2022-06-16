package oop.inheritence;

public class MainEmployees {
    public static void main(String[] args) {


        Person Esen = new Person("Esen", 25);
        Employees asan = new Employees("Asan", 18);
        Employees doha = new Employees("Doha", 30, 7);
        Employees isa = new Employees("Isa", 33, 3, "tester");
        Education aida = new Education("Aida", 18, 2, "Tester", "layer");

        Person joomart = new Employees("Joomart", 23, 5, "Tamada");

        Education kyyal = new Education("Kyial ", 21, 3, "HR", "actor");
        Actress penelopa = new Actress("Penelopa", 50);

        System.out.println(penelopa);



    }
}