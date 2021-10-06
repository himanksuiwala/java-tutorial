package com.suiwala;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    parseInt();
    userInput();

    }

    //Parsing a String into an Integer
    public static void parseInt(){

        //Number 2018 as string
        String numAsStr = "2018";
        System.out.println("Num as String: " + numAsStr);

        //Converting String to Integer Number
        int num =Integer.parseInt(numAsStr);
        System.out.println("Num is: "+num);

        numAsStr+=1; //1 will be concatenated as String
        num+=1; //1 will get added

        System.out.println("Num as String: "+numAsStr);
        System.out.println("Num: "+num);
    }


    //Taking Input from User
    public static void userInput(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter YOB: ");
        int yob = scn.nextInt();
        scn.nextLine(); //Handles next Line character(Enter Key)*Used with Integers/Double/Float etc*

        System.out.printf("Enter Your Name: ");
        String name = scn.nextLine();

        int age = 2021-yob;

        System.out.println("Your Name: "+name+",You're "+age+"yrs old");
        scn.close();
    }
}
