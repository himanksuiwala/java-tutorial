package com.suiwala;


//Basic Class
public class Player {
    public int health;
    public String name;
    public String weapon;

    public void loseHealth(int damage){
        this.health-=damage;
        if(this.health<=0){
            System.out.println("KO");
        }
    }

    public int healthRemain(){
        return this.health;
    }

}
