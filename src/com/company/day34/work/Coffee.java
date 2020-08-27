package com.company.day34.work;

public class Coffee {
    private String name;
    private int amount;
    public int totalPrice;
    public String ttt;

    public void init(String name, int price, int amount){
        this.name = name;
        this.amount = amount;
        totalPrice = price * amount;
        ppp();
    }

    public void ppp(){
        ttt = name + "\t" + amount + "\t" + totalPrice;
    }
}
