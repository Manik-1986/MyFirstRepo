package oop.inheritence;

public class Person {
    String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public String speak(){
        return "Bla, bla,bla";
    }
}
