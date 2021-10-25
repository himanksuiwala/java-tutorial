package com.suiwala;
class A
{
    public void methodA()
    {
        System.out.println("method of Class A");
    }
}
class B extends A
{
    public void methodB()
    {
        System.out.println("method of Class B");
    }
}
class C extends A
{
    public void methodC()
    {
        System.out.println("method of Class C");
    }
}

public class Hierarchical {
    public static void main(String args[])
    {
        B obj1 = new B();
        C obj2 = new C();

        obj1.methodA();
        obj2.methodA();

    }
}
