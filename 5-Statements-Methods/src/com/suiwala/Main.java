package com.suiwala;

public class Main {
    //Main Method
    public static void main(String[] args) {

        //Expressions in Java
        int a = 100; //Here a=100 is an Expression
        if (a > 10) {
        } //Here the content within parenthesis is an Expression


        //Statements in Java
        //Following are the various possible statemenvt Structure in Java

        int myVariable = 50;
        myVariable++;
        myVariable--;

        System.out.println("This is" +
                " another" +
                " statement");

        int spacedvariable
                = 55;


        //if-else-if Statement
        int score = 6000;

        if (score < 5000 && score > 1000) {
            System.out.println("Score is less than 5000 but greater than 1000");
        } else if (score < 100) {
            System.out.println("Score is LEss than 1000");
        } else {
            System.out.println("Got here");
        }


        //Different Ways to call Method
        boolean gameOver = true;
        score = 10000;
        int level = 8;
        int bonus = 200;

        int highScore = calculateScore(gameOver, score, level, bonus);
        System.out.println("Score " + highScore);

        //Calling the newly created Method
        int result = calculateScore(true, 800, 5, 100);
        System.out.println("Score" + result);


        //calling calculateHighScorePosition Method
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScore("Lolo", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScore("Bobo", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScore("Gogo", highScorePosition);
        highScorePosition = calculateHighScorePosition(40);
        displayHighScore("Momo", highScorePosition);


    }

    //2nd Method calculateScore with params
    public static int calculateScore(boolean gameOver, int score, int level, int bonus) {
        if (gameOver) {
            int finalScore = score + (level * bonus);
            finalScore += 1000;
//            System.out.println("Final Score: " + finalScore);
            return finalScore;
        }
        return -1;
    }

    //3rd void Method displayHighScore with params
    public static void displayHighScore(String name, int position) {
        System.out.println(name + " managed to get " + position + "position");
    }

    //4th Method calculateHighScorePosition with params returning int
    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }

}
