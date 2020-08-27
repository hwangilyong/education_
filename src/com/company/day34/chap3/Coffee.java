package com.company.day34.chap3;

public class Coffee {
    public String name = "";
    public int amount;
    public int totalPrice;

    public void init(String name, int price, int amount){
        this.name = name;
        this.amount = amount;
        totalPrice = price * amount;
    }

    public void ppp(){
        System.out.println(name + "\t" + amount + "\t" + totalPrice);
    }
}
