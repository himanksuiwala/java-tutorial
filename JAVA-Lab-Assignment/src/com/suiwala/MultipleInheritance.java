package com.suiwala;

interface InterfaceA
{
    public void disp();
}
interface InterfaceB
{
    public void disp();
}
public class MultipleInheritance implements InterfaceA,InterfaceB{

    @Override
    public void disp()
    {
        System.out.println("disp() method implementation");
    }
    public static void main(String args[])
    {
        MultipleInheritance c = new MultipleInheritance();
        c.disp();
    }
}
