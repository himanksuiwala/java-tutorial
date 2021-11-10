package com.suiwala;

public class Main {

    public static void main(String[] args) {
        ITelephone himankphone;
        himankphone = new DeskPhone(789456123);
        himankphone.powerOne();
        himankphone.callPhone(123456789);
        himankphone.answer();

        himankphone = new MobilePhone(123444778);
        himankphone.powerOne();
        himankphone.callPhone(123444778);
        himankphone.answer();
    }
}
