package com.suiwala;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        //METHOD 1
        int[] num = {1, 2, 3, 4, 5, 6};

        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);

        //METHOD 2
        int[] num2 = new int[10];
        for (int i = 0; i < num2.length; i++) {
            num2[i] = i * 10;
        }
          //Printing the values from num2
        for (int i = 0; i < num2.length; i++) {
            System.out.println("value: " + num2[i]);
        }

        int[] myint = getInt(5);
        for (int i = 0; i < myint.length; i++) {
            System.out.println("Value: " + myint[i]);
        }
        System.out.println("avg:" + avg(myint));*/

        int[] data = getIntegers(5);
        int[] sort = sortIntegers(data);
        showIntegers(sort);

    }

    private static int[] getInt(int number) {
        System.out.println("Enter :");
        int[] value = new int[number];

        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static double avg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    private static int[] getIntegers(int size) {
        System.out.println("Enter the Number of Elements: ");
        int[] num = new int[size];


        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        return num;
    }

    public static void showIntegers(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + " ");
        }
    }

    public static int[] sortIntegers(int[] num) {
        int[] sorted = Arrays.copyOf(num, num.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sorted.length - 1; i++) {
                if (sorted[i] < sorted[i + 1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sorted;
    }
}
