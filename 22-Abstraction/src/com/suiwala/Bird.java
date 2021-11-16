package com.suiwala;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("bird is eating");
    }

    @Override
    public void breath() {
        System.out.println("Bird is breathing");
    }



    @Override
    public void fly() {
        System.out.printf("Is flying with help of Interface");
    }
}
