package com.suiwala;

public interface ITelephone {
    void powerOne();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumeber);
    boolean isRinging();
}
