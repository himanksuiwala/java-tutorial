package com.suiwala;

//Child class that consists of properties of base class(Animal) as well
public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //Overidding the eat method of Animal class.
    //If Child class is invoked first then, first method from child class will be called then and at last the Parent method will be called if any
    //'super' keyword will invoke the members of Super class directly
    //'this' keyword will invoke the members of Current Class

    @Override
    public void eat() {
        System.out.println("Dog.eat()called");
        chew();
        super.eat();
    }

/*    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }*/

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1,1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew()
    {
        System.out.println("Dog.chew() called");
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
        //OR  super.move();

    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.movelegs() called");
    }
}
