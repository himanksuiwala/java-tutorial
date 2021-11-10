package challenge;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

            Bank bank  = new Bank("abc Bank");
            bank.addBranch("Ggn");
            bank.addCustomer("Ggn","Himank",12.22);
        bank.addCustomer("Ggn","Gogo",123.3);
        bank.addCustomer("Ggn","bgog",456.5);

        bank.addCustomerTransaction("Ggn","Himank",10.0);

        bank.listCustomers("Ggn",true);
    }


}
