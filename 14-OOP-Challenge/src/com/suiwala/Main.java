package com.suiwala;

class Car{
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels=4;
        this.engine=true;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine (){
        return "Engine Started";

    }

    public String Accelerate()
    {
        return "Car Accelerated";
    }

    public String Break()
    {
        return "Car screeched";
    }
}


class Mitshubishi extends Car{
    public Mitshubishi(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Mitshubishi Started";
    }

    @Override
    public String Accelerate() {
        return "Mitshubishi Zoop";
    }

    @Override
    public String Break() {
        return "Mitshubishi Screeched";
    }
}


public class Main {

    public static void main(String[] args) {

        Car car = new Car(8,"XOX");
        System.out.println(car.Accelerate());
        System.out.println(car.Break());
        System.out.println(car.getCylinder());

        Mitshubishi xo = new Mitshubishi(10,"xo");
        System.out.println(xo.Accelerate());
        System.out.println(xo.Break());
        System.out.println(xo.getCylinder());


        Ford fo = new Ford(10,"fo");
        System.out.println(fo.Accelerate());
        System.out.println(fo.Break());
        System.out.println(fo.getCylinder());

    }

    static class Ford extends Car{
        public Ford(int cylinder, String name) {
            super(cylinder, name);
        }

        @Override
        public String startEngine() {
            return  getClass().getSimpleName() + "Started";
        }

        @Override
        public String Accelerate() {
            return "Ford Zoop";
        }

        @Override
        public String Break() {
            return "Ford Screeched";
        }
    }
}
