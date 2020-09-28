package com.company.day38.bar;

public class SaCola extends Menu{
    private int colaRatio = 5;
    private int cidarRatio = 5;

    private SaCola(){
        super("사콜", 450);
    }

    public SaCola(int colaRatio){
        super("사콜" ,450);
        this.colaRatio = colaRatio;
        this.cidarRatio = 10 - colaRatio;
    }

    public int getUsedCidar(){
        return cidarRatio * getTotal();
    }

    public int getUsedcolar(){
        return colaRatio * getTotal();
    }
}
