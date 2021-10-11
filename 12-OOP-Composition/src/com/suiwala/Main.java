package com.suiwala;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch B", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BH200", "Asus", 4, 6, "v.22");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUP();

        Light theLight = new Light("204V","Wipro",1);
        Fan theFan = new Fan("Falcon","Oricent",1);
        Door theDoor = new Door(1,10,15);

        Room theRoom = new Room(theLight,theDoor,theFan);
        theRoom.EnterRoom();

    }
}
