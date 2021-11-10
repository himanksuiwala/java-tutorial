package com.challenge;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> val = new ArrayList<>();
        val.add(0,this.name);
        val.add(1,""+this.hitPoints);
        val.add(2,""+this.strength);
        return val ;
    }

    @Override
    public void read(List<String> savedVal) {
        if(savedVal!=null && savedVal.size()>0)
        {
            this.name= savedVal.get(0);
            this.hitPoints = Integer.parseInt(savedVal.get(1));
            this.strength = Integer.parseInt(savedVal.get(2));
        }
    }
}
