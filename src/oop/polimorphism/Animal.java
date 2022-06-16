package oop.polimorphism;

public class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String voice(){
        return "This is my voice";
    }
    public String voice(String secondname){
        return "This is my second voice";
    }
}
