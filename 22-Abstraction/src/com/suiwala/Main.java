package com.suiwala;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Cookie");
        dog.eat();
        dog.breath();

        Parrot bird = new Parrot("Parrot");
        bird.breath();
        bird.eat();
        bird.fly();

        Penguin penguin = new Penguin("Pupu");
        penguin.fly();
        penguin.breath();
    }
}
