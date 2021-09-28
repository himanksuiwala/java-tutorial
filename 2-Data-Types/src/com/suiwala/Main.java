package com.suiwala;

public class Main {

    public static void main(String[] args) {
        // Integer
        int value=10000;
        int intminValue=Integer.MIN_VALUE;
        int intmaxValue=Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: "+intminValue);
        System.out.println("Integer Maximum Value: "+intmaxValue); //Converted maxValue to String

        // Byte
          byte byteminValue=Byte.MIN_VALUE;
          byte bytemaxValue=Byte.MAX_VALUE;
          System.out.println("Byte Minimum Value: "+byteminValue);
          System.out.println("Byte Maximum Value: "+bytemaxValue); //Converted maxValue to String

        // Short
            short shortminValue=Short.MIN_VALUE;
            short shortmaxValue=Short.MAX_VALUE;
            System.out.println("Short Minimum Value: "+shortminValue);
            System.out.println("Short Maximum Value: "+shortmaxValue); //Converted maxValue to String

        // Long
        long minValue=Long.MIN_VALUE;
        long maxValue=Long.MAX_VALUE;
        System.out.println("long Minimum Value: "+minValue);
        System.out.println("long Maximum Value: "+maxValue); //Converted maxValue to String
//        short Big = 32_766;


        //TypeCasting of DataTypes
        int mytotal = (intminValue)/2;
        byte bytevalue=(byte)(byteminValue/2);
        short shortvalue = (short)(shortminValue/2);

        //Float
        float floatminValue=Float.MIN_VALUE;
        float floatmaxValue=Float.MAX_VALUE;
        System.out.println("float Minimum Value: "+minValue);
        System.out.println("float Maximum Value: "+maxValue);

        //Double
        double doubleminValue=Double.MIN_VALUE;
        double doublemaxValue=Double.MAX_VALUE;
        System.out.println("double Minimum Value: "+minValue);
        System.out.println("double Maximum Value: "+maxValue);

        int intval = 5/2;
        float floatval = 5f/2;
        double doubleval = 5d/2;
        System.out.println("int val: "+ intval);
        System.out.println("float val: "+ floatval);
        System.out.println("Double val: "+ doubleval);

        double convert = 10d;
        double pound = 0.45359237d;
        double result = convert*pound;
        System.out.println(result);

        //char
        char myChar='D';
        char unicodechar='\u0044';
        System.out.println(unicodechar);
        char mycopyrightChar = '\u00A9';
        System.out.println(mycopyrightChar);

        //boolean
        boolean mytrueval=true;
        boolean myfalseval=false;
        boolean isCustomerOverTwentyOne = true;

        //String
        String mystr = "This is Himank";
        mystr = mystr + " This is added Later...";
        System.out.println(mystr);
        String numberString = "250.22";
        numberString+="40.3";
        System.out.println(numberString);
        int myInt  = 50;
        String last = "10";
        last+=myInt;
        System.out.println(last);















    }
}
///////////OUTPUT//////////////
/*
* Integer Minimum Value: -2147483648
Integer Maximum Value: 2147483647
Byte Minimum Value: -128
Byte Maximum Value: 127
Short Minimum Value: -32768
Short Maximum Value: 32767
long Minimum Value: -9223372036854775808
long Maximum Value: 9223372036854775807
* */
