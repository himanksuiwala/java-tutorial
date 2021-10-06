package com.suiwala;

public class Main {
    //Method Overloading deals with same method with different params
    public static void main(String[] args) {

        int newScore = calculateScore("Gogo",50);
        System.out.println("New Score "+ newScore);
        calculateScore();
        calcFeetAndInchToCentimeters(0,-5);
        calcFeetAndInchToCentimeters(-100);
    }
    //Method 1 with 2 params
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName +" scored "+ score+ " Points");
        return score*1000;
    }
    //Method 1 with 1 params

    public static int calculateScore(int score){
        System.out.println("Unnamed Player "+" scored "+ score+ " Points");
        return score*5000;
    }

    public static void calculateScore(){
        System.out.println("No Player here ");
    }
    /////////////////

    public static double calcFeetAndInchToCentimeters(int feet,int inches){
        if((feet<0) || (inches<0) || (inches>12)){
            System.out.println("Invalid Data");
            return -1;
        }

        int footToinch = feet*12;
        int inch = footToinch + inches;
        double cent = inch * 2.54;
        System.out.println(feet+"feet, "+inch+"inches = "+ cent+ "cm");
        return cent;
    }

    public static double calcFeetAndInchToCentimeters(double inches){
        if(inches<0){
            System.out.println("Invalid Data");

            return -1;
        }
        double feet = (int) inches/12;
        double remain = (int) inches % 12;
        System.out.println(inches+"inches equals to"+ feet+ "feet and "+ remain);
        return remain;
    }




}
