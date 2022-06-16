package oop.polimorphism;

public class Kitten extends Cat{
    public Kitten(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public String toString() {
        return "Kitten{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
