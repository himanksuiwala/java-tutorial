package com.suiwala;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // ArrayList<int> intArrayList  = new ArrayList<int>();//
        // The above declaration is invalid as we can only use Class object for Lists
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0;i<=10;i++)
        {
            intArrayList.add(Integer.valueOf(i));                            //<------AutoBoxing
        }

        for(int i=0;i<=10;i++){
            System.out.println( i +" - "+ intArrayList.get(i).intValue());   //<------UnBoxing
        }

        Integer myIntval = 68;
        int myInt = myIntval.intValue();
        System.out.println(myInt);
    }
}
