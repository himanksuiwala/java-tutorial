package com.suiwala;

public class RunnableThread {
    public static void main(String[] args) {
        Multi3 m1=new Multi3();
        Thread t21 =new Thread(m1);   // Using the constructor Thread(Runnable r)
        t21.start();
    }
}

class Multi3 implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }
}