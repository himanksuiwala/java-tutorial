package com.suiwala;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        //super.fly();
        System.out.println("\nCan't Fly");
    }
}
