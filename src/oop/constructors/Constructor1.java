package oop.constructors;

public class Constructor1 {
    String mark;
    String model;
    String color;
    double volume;
    int wheel;
    int years;

    public String driving(){
        return model + " is driving";
    }

    public String beeping(){
        return model + " beep beep!!";
    }
    public void getInfo(){
        System.out.println("Mark: " + mark +"\n"
        + "Model: " + model + "\n" +
                "color: " + color + "\n"
                +"volume: " + volume + "\n"
                +"whell: " + wheel+ "\n"
                 +"years: " + years + "\n" );
    }




}
