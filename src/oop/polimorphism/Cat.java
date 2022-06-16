package oop.polimorphism;

public class Cat extends Animal {

    String breed;


    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String voice() {
        return "MUY MUY";
    }

    @Override
    public String voice(String secondname) {
        return "may may";
    }
}

