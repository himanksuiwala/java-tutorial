package com.suiwala;


//Here the Room Class is composed of Light,Fan, Door
public class Room {
    private Light theLight;
    private Door theDoor;
    private Fan theFan;

    public Room(Light theLight, Door theDoor, Fan theFan) {
        this.theLight = theLight;
        this.theDoor = theDoor;
        this.theFan = theFan;
    }
    public void EnterRoom(){
        System.out.println("You've entered into the Room");
        theFan.FanDetail("204V","Wipro",1);
    }
}
