package com.suiwala;

public class Main {

    public static void main(String[] args) {
        //using the Class Car in Main Class
     /*   Car hyundai = new Car();
        //hyundai.model = "i20"; // Not possible due to access specifier
        hyundai.setModel("i20");

        System.out.println("Model is " + hyundai.getModel());

        hyundai.setModel("i10");
        System.out.println("Model is " + hyundai.getModel());*/
        
        BankAccount user = new BankAccount();
        user.Deposit(100);
        user.Withdraw(100);

    }
}
