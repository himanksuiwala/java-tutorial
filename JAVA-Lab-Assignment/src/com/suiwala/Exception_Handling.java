package com.suiwala;

public class Exception_Handling {

    public static void main(String[] args) {
        try {
            computed(1);
            computed(20);
        } catch (MyException e) {
            System.out.println("Caught " + e);
        }
    }

    private static void computed(int a)throws MyException {

            System.out.println("Called compute(" + a + ")");
            if(a > 10)
                throw new MyException(a);
            System.out.println("Normal exit");
    }

}
class MyException extends Exception{
    private int detail;
    MyException(int a) {
        detail = a;
    }
    public String toString() {
        return "MyException[" + detail + "]";
    }
}


