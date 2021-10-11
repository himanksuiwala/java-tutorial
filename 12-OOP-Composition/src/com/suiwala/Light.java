package com.suiwala;

public class Light {
    private String model;
    private String brand;
    private int count;

    public Light(String model, String brand, int count) {
        this.model = model;
        this.brand = brand;
        this.count = count;
    }
    public void showLight(String model,String brand,int count){
        System.out.println("You've " +model + " of"+brand+" "+count);
    }
}
