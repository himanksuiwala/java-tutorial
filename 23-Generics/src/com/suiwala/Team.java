package com.suiwala;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player) {
        if(members.contains(player)){
            System.out.println("Already Present");
            return false;
        }else{
            members.add(player);
            System.out.printf("Added to team "+ this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent,int ourScore,int theirScore){
        String message="";
        if(ourScore>theirScore) {
            won++;
            message  = "beat";
        }else if(ourScore==theirScore){
            tied++;
            message = "drew";
        }else{
            lost++;
            message = "Lost";
        }
        played++;
        if(opponent!=null){
            System.out.println(this.getName()+message+opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);

        }
    }

    public int ranking()
    {
        return (won*2)+tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking()>team.ranking()){
            return -1;
        }else if(this.ranking()< team.ranking()){
            return 1;
        }else{
            return 0;
        }

    }
}
