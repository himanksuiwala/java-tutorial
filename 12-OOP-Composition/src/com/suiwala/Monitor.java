package com.suiwala;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    //Resolution Class--> As although Monitor is not Resolution but it consists of Resolution
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelAt(int x,int y,String color){
        System.out.println("Draw at "+x+" "+y);
    }
}
