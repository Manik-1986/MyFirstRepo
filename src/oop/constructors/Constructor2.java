package oop.constructors;

public class Constructor2 {
    String mark;
    String model;
    String color;
    double volume;
    int wheel;
    int years;
    // конструктор
    public Constructor2(String mark1, String model1, String color1, double volume1, int years1, int wheel1){
         mark = mark1;
        model = model1;
         color = color1;
        volume = volume1;
        wheel = wheel1 ;
        years = years1 ;
    }

    public Constructor2(String mark1, String model1, int years1){
        mark = mark1;
        model = model1;
        years1= years1;
    }

    public String driving(){
        return model + " is driving";
    }

    public String beeping(){
        return model + " beep beep!!";
    }
}
