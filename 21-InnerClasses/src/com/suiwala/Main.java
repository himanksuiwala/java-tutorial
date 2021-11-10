package com.suiwala;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btn = new Button("Print");

    public static void main(String[] args) {
    /*	GearBox Maruti = new GearBox(5);
        Maruti.addGear(1,1.3);
        Maruti.addGear(2,10.60);
        Maruti.operateClutch(true);
        Maruti.changeGear(1);
        Maruti.operateClutch(false);
            System.out.println(Maruti.wheelSpeed(100)  );
        Maruti.changeGear(2);
            System.out.println(Maruti.wheelSpeed(200));*/

        //Local Class
        class ClickListener implements Button.OnClickListener {

            public ClickListener() {
                System.out.println("Initiated");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + ": is clicked");
            }
        }
        btn.setOnClickListener(new ClickListener());
        btn.onClick();

    }
}
