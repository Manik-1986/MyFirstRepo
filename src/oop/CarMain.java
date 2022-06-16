package oop;

public class CarMain {
    public static void main(String[] args) {
        Car mers = new Car();
        System.out.println(mers.mark +"\n"
                + mers.model+"\n"
                +mers.color+"\n"
                +mers.capacity + "\n"
                +mers.year+"\n"
                +mers.countryOfOrigin);
        System.out.println("_________________");
        mers.model = "GW";
        System.out.println(mers.mark +"\n"
                + mers.model+"\n"
                +mers.color+"\n"
                +mers.capacity + "\n"
                +mers.year+"\n"
                +mers.countryOfOrigin);
    }
}
