package com.suiwala;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int cur_value = 10;
        int copied_val = cur_value;

        System.out.println("Current Val: " + cur_value);
        System.out.println("Copied Val " + copied_val);

        //Now Incrementing the Copied Value
        copied_val++;
        System.out.println("Current Val: " + cur_value);
        System.out.println("Copied Val " + copied_val);



        int[] array = new int[5];
        int[] copied_array = array;

        System.out.println("From Array: " + Arrays.toString(array));
        System.out.println("From Copied Array: " + Arrays.toString(copied_array));

        copied_array[0] = 10;
        System.out.println("From Array: " + Arrays.toString(array));
        System.out.println("From Copied Array: " + Arrays.toString(copied_array));

        //Both of the Array consists of same value because in Array 'array'
        //we're referencing the array to it not the actual value. So any modification will result in changes
        //in both of the array

        copied_array = new int[]{1, 2, 5, 4, 8}; // Here we are de-referencing and the referencing the array
        modify(array);
        System.out.println("From Array: " + Arrays.toString(array));
        System.out.println("From Copied Array: " + Arrays.toString(copied_array));

    }

    public static void modify(int[] array) {
        array[0] = 100;
        array = new int[]{10, 22, 33, 55, 55};
    }

}
