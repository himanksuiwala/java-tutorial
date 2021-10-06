package com.suiwala;

public class Main<a> {

    public static void main(String[] args) {
        int switchVal = 4;
        SwitchStatment(4);
        SwitchChar('t');
        DayoftheWeek(3);
        calculateIntrest();
        whileLoop(1);
        doWhile(6);
        int val = EvenNumberPrinter(4);
        System.out.println(val);
    }

    //SWITCH STATEMENT
    public static void SwitchStatment(int switchVal) {
        switch (switchVal) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Either 3 or 4 or 5");
                System.out.println("It was " + switchVal);
                break;
            default:
                System.out.println("Neither 1 or 2,3,4,5");
        }
    }

    public static void SwitchChar(char switchChar) {
        switch (switchChar) {
            case 'A':
                System.out.println("it's A");
                break;
            case 'B':
                System.out.println("it's B");
                break;
            case 'C':
                System.out.println("it's C");
                break;
            case 'D':
            case 'E':
                System.out.println("Either D or E");
                break;
            default:
                System.out.println("Neither of above");

        }
    }

    public static void DayoftheWeek(int n) {
        switch (n) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");

        }
    }


    //FOR-Loop STATEMENT
    public static void calculateIntrest() {
        for (int a = 8; a >= 2; a--) {
            System.out.println("10,000 at " + a + "%: " + String.format("%.2f", Interest(10000.0, a)));
        }
    }

    public static double Interest(double amt, double intrest) {
        return (amt * (intrest / 100));
    }


    //WHILE-Loop STATEMENT
    public static void whileLoop(int n) {
        while (n != 6) {
            System.out.println("Count value is:" + n);
            n++;
        }
    }


    //DO-WHILE-STATEMENT
    public static void doWhile(int n) {

        do {
            System.out.println("Count Was " + n);
            n++;
            if (n > 25) {
                break;
            }
        } while (n != 6);
    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static int EvenNumberPrinter(int n) {
        int last = 20;
        int count = 0;
        while (n <= last) {
            n++;

            if (!isEvenNumber(n)) {
                continue;
            }
            if (count == 5) {
                break;
            }
            count++;
            System.out.println("Even Number: " + n);
        }
        return count;
    }
}
