package com.suiwala;

public class Printer {
    private int count;
    private int tonerlevel;
    private boolean duplex;

    public Printer( int tonerlevel, boolean duplex) {
        this.count = count;
        if(tonerlevel>=1 && tonerlevel<=100)
        {
            this.tonerlevel = tonerlevel;
        }
        else {
            this.tonerlevel = -1;
        }

        this.duplex = duplex;
    }

    public int getCount() {
        return count;
    }

    public int fillPrinter(int toneramt) {
        if(tonerlevel>0 && toneramt<=100){
            if(this.tonerlevel+toneramt > 100){
                return -1;
            }
            this.tonerlevel+=toneramt;
            return  this.tonerlevel;
        }else{
            return -1;
        }
    }

    public int printpage(int page){
        int pagesToprint = page;
        if(this.duplex){
            pagesToprint=(page/2)+(page%2);
            System.out.println("Printing in Duplex Mode");
        }
        this.count+=pagesToprint;
        return pagesToprint;
    }

}
