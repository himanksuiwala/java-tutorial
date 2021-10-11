package com.suiwala;


//Encapsulated Class
public class Player_Encapsulated {
    private int hitPoints =100;
    private String name;
    private String weapon;

    public Player_Encapsulated(int health, String name, String weapon) {
        if(health>0 && health<=100){
            this.hitPoints = health;
        }
        this.name = name;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints -=damage;
        if(this.hitPoints <=0){
            System.out.println("KO");
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
