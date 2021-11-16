package com.suiwala;

public class Main_challenge {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("LaLiga");
        Team<FootballPlayer>hawthorn = new Team<>("HawThorn");
        Team<FootballPlayer>fremantle = new Team<>("Fremantle");
        Team <FootballPlayer> footballTeam= new Team<>("footballTeam");
        Team <BaseballPlayer> BaseballTeam= new Team<>("BaseballTeam");
        Team <SoccerPlayer> soccerTeam= new Team<>("SoccerTeam");

        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);
        footballLeague.add(footballTeam);
      //  footballLeague.add(BaseballTeam);

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(footballTeam,3,0);
        footballLeague.showTable();

    }
}
