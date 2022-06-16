package oop;

import oop.abstrackt.metods.Phone;

public class IOS extends Phone {
    public IOS(String mark, String model, String memory) {
        super(mark, model, memory);
    }

    @Override
    public String sendMessage() {
        return "Text me  ////";
    }
}
