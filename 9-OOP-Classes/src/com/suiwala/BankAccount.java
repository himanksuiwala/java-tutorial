package com.suiwala;

public class BankAccount {
    private int acnumber;
    private double balance;
    private String cname;
    private String email;
    private int phone;

    public void Deposit(int amount)
    {

        this.balance+=amount;
        System.out.println("You've sucessfully deposited the money");
    }

    public void  Withdraw(int amount){
        if(amount>this.balance){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println("Sucess!!");
        }

    }

}
