package com.suiwala;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    public int getMyNumber() {
        return myNumber;
    }

    @Override
    public void powerOne() {
        System.out.println("No Actions");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Ringing through Deskphone");
    }

    @Override
    public void answer() {
    if(isRinging){
        System.out.println("Answering the Deskphone");
        isRinging = false;
    }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber){
            isRinging = true;
            System.out.println("Ring Ring");
        }else {
            isRinging= false;
        }


        return isRinging    ;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
