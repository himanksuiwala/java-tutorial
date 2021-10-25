package com.suiwala;

public class Multilevel {


    public static void main(String arg[]) {
        Manager m = new Manager();
        m.nationality();
        m.organization();
        m.subordinates();
        m.place();
    }
}

class Person {
    Person() {
        System.out.println("Person constructor");
    }

    void nationality() {
        System.out.println("Indian");
    }

    void place() {
        System.out.println("Mumbai");
    }
}

class Emp extends Person {
    Emp() {
        System.out.println("Emp constructor");
    }

    void organization() {
        System.out.println("IBM");
    }

    void place() {
        System.out.println("New York");
    }
}

class Manager extends Emp {
    Manager() {
        System.out.println("Manager constructor");
    }

    void subordinates() {
        System.out.println(12);
    }

    void place() {
        System.out.println("London");
    }

}
