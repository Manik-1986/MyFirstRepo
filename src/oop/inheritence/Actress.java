package oop.inheritence;

public class Actress extends Employees{

    String oskar;


    public Actress(String name, int age, int experience, String profession) {
        super(name, age, experience, profession);
    }

    public Actress(String name, int age) {
        super(name, age);
    }
    public String greeting(){
        return name + ": Hello everyone";
    }

    @Override
    public String toString() {
        return "Actress{" +
                ", name='" + name + '\'' +
                ", age=" + getAge() +'\''+
                "action=' " + work() +'\'' +

                '}' ;
    }
}
