package com.suiwala;

public class Vip {
    private String name;
    private double limit;
    private String email;


    public Vip(){
        this("default name",100.00,"defaultemail");
        System.out.println("Default result");
    }

    public Vip(String name,Double limit){
        this(name,limit,"me.com");
    }

    public Vip(String name,Double limit,String email ){
        this.name= name;
        this.limit = limit;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
