package oop.constructors.person_practice;

public class PersonMain {
    public static void main(String[] args) {
        Person gulkair = new Person("Gulkair", 18, 'f', "+999555099898");
        gulkair.name = "Gulchik";
        gulkair.age = 21;
        gulkair.setPhoneNumber("+996787878");
        System.out.println(gulkair.name + "age: " + gulkair.age + "Gender: "
                + gulkair.gender + "number: " + gulkair.getPhoneNumber());


        System.out.println(gulkair);
        System.out.println(gulkair.moving());
    }
}
