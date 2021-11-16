package com.suiwala;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if (league.contains(team)) {
            System.out.println("Already present");
            return false;
        } else {
            league.add(team);
            System.out.println("Added to " + this.name + "\n");
            return true;
        }
    }

    public void showTable(){
        Collections.sort(league);
        for(T t: league)
        {
            System.out.println(t.getName()+": "+t.ranking()+"\n");
        }
    }

}
