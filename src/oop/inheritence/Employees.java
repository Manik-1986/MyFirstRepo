package oop.inheritence;

public class Employees  extends Person{
    protected int experience;
    public String profession;

    public Employees(String name, int age) {
        super(name, age);
    }

    public Employees(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    public Employees(String name, int age, int experience, String profession) {
        super(name, age);
        this.experience = experience;
        this.profession = profession;
    }

    public String work() {
        return "Work, work";

    }


}
