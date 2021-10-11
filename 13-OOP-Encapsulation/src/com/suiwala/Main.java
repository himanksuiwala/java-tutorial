package com.suiwala;

public class Main {

    public static void main(String[] args) {

        //From Naive Class
/*	Player player = new Player();
    player.name = "Himank";
    player.health = 20;
    player.weapon = "Sword";

    int damage =10;
    player.loseHealth(damage);
        System.out.println("Remain "+ player.healthRemain());

        player.health =100;
        player.loseHealth(damage);
        System.out.println("Remain "+ player.healthRemain());*/


        //From Encapsulated Class
        Player_Encapsulated player = new Player_Encapsulated(200, "Himank", "Sword");
        System.out.println("Initial: " + player.getHealth());

        //
        Printer printer = new Printer(50,false);
        System.out.println("Initial: "+printer.getCount());
        System.out.println("Printed pages: "+printer.printpage(4));
        System.out.println("Printed again: "+printer.printpage(2));
    }
}
