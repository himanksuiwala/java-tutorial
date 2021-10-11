package com.suiwala;

public class Fan {
    private String model;
    private String brand;
    private int count;

    public Fan(String model, String brand, int count) {
        this.model = model;
        this.brand = brand;
        this.count = count;
    }

    public void FanDetail (String model, String brand, int count)
    {
        System.out.println(model +" "+brand+" "+count);
    }
}
