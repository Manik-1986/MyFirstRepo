package oop.abstrackt;

import oop.Adroid;
import oop.IOS;
import oop.abstrackt.metods.Phone;

public class MainPhone {
    public static void main(String[] args) {

        Adroid samsung = new Adroid("Samsung","S22", "256");
        System.out.println(samsung.answer());
        System.out.println(samsung.decLine());
        System.out.println(samsung.sendMessage());

        IOS iPhone = new IOS("Apple","Iphonee 12 pro","512");
        System.out.println(iPhone.answer());
        System.out.println(iPhone.decLine());
        System.out.println(iPhone.sendMessage());






    }
}
