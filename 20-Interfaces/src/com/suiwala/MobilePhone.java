package com.suiwala;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    public int getMyNumber() {
        return myNumber;
    }

    @Override
    public void powerOne() {
        isOn = true;
        System.out.println("Mobile Phone PowerUP");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn)
        {
            System.out.println("Now Ringing on Mobile Phone");
        }else{
            System.out.println("Mobile is switched off");
        }
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
            System.out.println("Melody Ring");
        }else {
            isRinging= false;
            System.out.println("Mobile Number is incorrect");
        }


        return isRinging    ;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
