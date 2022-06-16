package oop.abstrackt.metods;

import java.security.PublicKey;

public abstract class Phone {
    public String greenButton;
    public String redButton;
    public String mark;
    public String model;
    public String memory;

    public Phone(String mark, String model, String memory) {
        this.mark = mark;
        this.model = model;
        this.memory = memory;
    }

    public String answer(){
        return "Alo alo";
    }

    public String decLine(){
        return "Tuut Tuuut";
    }
    public abstract String sendMessage();

    @Override
    public String toString(){
        return "Phone{";
    }







    }

