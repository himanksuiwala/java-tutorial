package com.suiwala;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Tommy",8,20,2,4,1,20,"silky");
        //Inherited from Animal(public) Class
        dog.eat();
        dog.walk();
        dog.run();
    }
}
