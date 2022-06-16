package oop;

import oop.abstrackt.metods.Phone;

public class Adroid extends Phone {
    public Adroid(String mark, String model, String memory) {
        super(mark, model, memory);
    }

    @Override
    public String sendMessage(){
        String msg1 = "I am busy in at the moment";
        String msg2 = "Call me later";

        return "Tuping from Android .....";
    }


}
