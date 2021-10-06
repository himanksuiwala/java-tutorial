package com.suiwala;

public class Car {

    //Fields in Java(like data members in C++)
    //Access Specifier Private & Public
    //In Public, the field/method is present throughout the Project.
    //In Private, the field/Method is present in the Specific class only.
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //Setter Function used to get data from Main or to set field value
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("i20")||validModel.equals("verna")){
            this.model = model;  //storing the value of param model into field model
        }else {
            this.model = "Unknown";
        }

    }

    //Getter Function used to send data to Main or to get the field Value
    public String getModel(){
        return this.model;
    }
}
