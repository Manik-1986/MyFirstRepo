package oop.polimorphism;

public class MainAnimal {
    public static void main(String[] args) {
        Kitten pussycat = new Kitten("Kate", 2, "Scotish Vol");
        System.out.println(pussycat.voice());

        Cat cat = new Cat("Lily", 2 , "siamskie");
        System.out.println(cat.name + ": " + cat.voice());
        System.out.println("Kate: " + cat.voice("Kate"));

        Dog dog = new Dog ("aktosh", 5);
        System.out.println(dog);
        System.out.println(dog.voice());
    }
}
