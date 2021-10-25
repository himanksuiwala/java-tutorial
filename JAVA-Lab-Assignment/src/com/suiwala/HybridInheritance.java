package com.suiwala;
class third {
    public void disp()
    {
        System.out.println("C");
    }
}

class first extends third
{
    public void disp()
    {
        System.out.println("A");
    }
}

class second extends third
{
    public void disp()
    {
        System.out.println("B");
    }

}

class fourth extends first {
    public void disp() {
        System.out.println("D");
    }
}
public class HybridInheritance {
    public static void main(String args[]){

        fourth obj = new fourth();
        obj.disp();
    }
}

