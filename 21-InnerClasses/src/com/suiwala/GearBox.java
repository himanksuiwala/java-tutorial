package com.suiwala;

import java.util.ArrayList;

public class GearBox {

    private ArrayList<Gear> gears;
    private  int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public void operateClutch(boolean in)
    {
        this.clutchIsIn=in;
    }

    public GearBox(int maxGears){
        this.maxGears = maxGears;
        this.gears =new ArrayList<>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    public void addGear(int num, double ratio)
    {
        if(num>0 && num<=maxGears){
            this.gears.add(new Gear(num,ratio));

        }
    }

    public void changeGear(int newGear)
    {
        if((newGear>=0) && (newGear<this.gears.size()&&this.clutchIsIn)){
            System.out.println("Gear:"+newGear+"selected" );
        }else{
            System.out.println("Grind!");
            this.currentGear=0;
        }
    }

    public double wheelSpeed(int revs)
    {
        if(clutchIsIn){
            System.out.printf("Scream");
            return 0.0;
        }
        return revs*gears.get(currentGear).getRatio();
    }
    public class Gear{
        private int gearNum;
        private double ratio;

        public Gear(int gearNum, double ratio) {
            this.gearNum = gearNum;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public void setRatio(double ratio) {
            this.ratio = ratio;
        }

        public double driveSpeed(int revs)
        {
            return revs*(this.ratio);
        }
    }

}
