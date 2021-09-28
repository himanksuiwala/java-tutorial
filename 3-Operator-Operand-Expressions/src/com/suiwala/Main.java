package com.suiwala;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1+2=" + result);
        int previousResult = result;
        System.out.println("previousVal: "+ previousResult);
        result-=1;

        result*=10;
        System.out.println("2*10 = "+result);

        result/=5;
        System.out.println("20/5 = "+result);

        result%=3;
        System.out.println("4%3 = "+result);


        boolean isAlien = false;
        if(isAlien==true)
            System.out.println("It is not an Alien");
            System.out.println("I'm Scared");


        int topScore = 91;
        if(topScore<100) {
            System.out.printf("Got the High Score");
        }

        //AND Operator
        int secondTopScore = 81;
        if(topScore>secondTopScore && topScore<100) {
            System.out.println("Greater than second Top score but less than 100");
        }

        //OR Operator
        if(topScore>90 || secondTopScore<=90){
            System.out.println("Either or both are True");
        }

        //Assignment vs isEqualsto? Operator
        int newval = 50;
        if(newval==80){
            System.out.println("This is Error");
        }

        boolean isCar = false;
        if(isCar=true){
            System.out.println("This not supposed to Happen");
        }

        //Not Operator
        boolean iscar = false;
        if(!iscar){
            System.out.println("This is false");
        }

        //Terenary Operator
        isCar =false;
        boolean wasCar = isCar ? true:false;
        if(wasCar){
            System.out.println("wasCar is True");

        }


        //Operator Precedence
        double first = 20.00d;
        double second = 80.00d;

        double sum = first+second*100;

        double remainder = sum%40.00;
        System.out.println(remainder);

        boolean isNoRemainder = (remainder==0)?true:false;

        System.out.println(isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got Some Remainder");
        }


    }
}

///////////OUTPUT////////////////
/*
    * 1+2=3
    previousVal: 3
    2*10 = 20
    20/5 = 4
    4%3 = 1
    I'm Scared
    Got the High ScoreGreater than second Top score but less than 100
    Either or both are True
    This not supposed to Happen
    This is false
    20.0
    false
    Got Some Remainder

* */