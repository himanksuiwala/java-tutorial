package com.challenge;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Player Himank = new Player("Himank",10,15);
        System.out.println(Himank.toString());
        saveObject(Himank);
        Himank.setHitPoints(1000);
        System.out.println(Himank);
        saveObject(Himank);
        //LoadObject(Himank);
        System.out.println(Himank);

        ISaveable werewolf = new Monster("WereWolf",20,40);
        System.out.println(werewolf);
        System.out.println(((Monster)werewolf).getStrength());
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> val = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose:\n"+
                "1 To Enter String\n"+
                "0 TO Quit");

        while(!quit)
        {
            System.out.println("Choose an Option:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 0:
                    quit=true ;
                    break;
                case 1:
                    System.out.println("Enter String: ");
                    String stringInput = scanner.nextLine();
                    val.add(index,stringInput);
                    index++;
                    break;
            }

        }  return val;
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++)
        {
            System.out.println("Saving:"+objectToSave.write().get(i)+" To storage");
        }
    }
    public static void LoadObject(ISaveable objectToLoad)
    {
        ArrayList<String> val = readValues();
        objectToLoad.read(val);
    }
}
