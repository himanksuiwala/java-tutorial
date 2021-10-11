package com.suiwala;

public class Main {

    public static void main(String[] args) {


        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com","(087) 123-4567"); // "12345", 0.00, "Bob Brown", "myemail@bob.com",
                // "(087) 123-4567");
       /* System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account himank = new Account("Himank","email","123456");
        System.out.println(himank.getNumber()+" name " +himank.getCustomerName());
    */

        Vip p = new Vip();
        System.out.println(p.getName());
        Vip p2 = new Vip("BOBBHY", 213.2);
        System.out.println(p2.getEmail());
    }

}
