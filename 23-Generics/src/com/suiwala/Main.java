package com.suiwala;

public class Main {

    public static void main(String[] args) {
	FootballPlayer joe = new FootballPlayer("Joe");
    BaseballPlayer pat = new BaseballPlayer("Pat");
    SoccerPlayer beckham  = new SoccerPlayer("Beckham");


    Team <FootballPlayer> footballTeam= new Team<>("footballTeam");
    Team <BaseballPlayer> BaseballTeam= new Team<>("BaseballTeam");
    Team <SoccerPlayer> soccerTeam= new Team<>("SoccerTeam");

    footballTeam.addPlayer(joe);
    BaseballTeam.addPlayer(pat);
    soccerTeam.addPlayer(beckham);

    Team<FootballPlayer>hawthorn = new Team<>("HawThorn");
    Team<FootballPlayer>fremantle = new Team<>("Fremantle");

    hawthorn.matchResult(fremantle,1,0);
    hawthorn.matchResult(footballTeam,3,0);

    footballTeam.matchResult(fremantle,2,1);
    //footballTeam.matchResult(BaseballTeam,1,1);

        System.out.println("\n"+footballTeam.compareTo(hawthorn));
    }
}
