package com.company.day33.chap4;

public class Coffee {
    String coffeeName;
    int milkAmount;
    int price;
    boolean whipping;
    int syrup;
    int totalPrice;
    String string;

    void init(int coffeeAmount){
        coffeeName = "아메리카노";
        price = 3000;

        calc(price, coffeeAmount);

        string = coffeeName + "\t" + coffeeAmount + "\t" + totalPrice;
        ppp();
    }

    void init(int coffeeAmount, int milkAmount){
        coffeeName = "카페라떼";
        this.milkAmount = milkAmount;

        price = 3300;

        calc(price, coffeeAmount);

        string = coffeeName + "\t" + coffeeAmount + "\t" + totalPrice;
        ppp();
    }

    void init(int coffeeAmount, int milkAmount, int syrup){
        coffeeName = "카라멜마끼아또";
        this.milkAmount = milkAmount;
        this.syrup = syrup;

        price = 3500;

        calc(price, coffeeAmount);

        string = coffeeName + "\t" + coffeeAmount + "\t" + totalPrice;
        ppp();
    }

    void init(int coffeeAmount, int milkAmount, boolean whipping){
        coffeeName = "카페모카";
        this.milkAmount = milkAmount;
        this.whipping = whipping;

        price = 3500;

        calc(price, coffeeAmount);

        string = coffeeName + "\t" + coffeeAmount + "\t" + totalPrice;
        ppp();
    }

    void calc(int price, int coffeeAmount){totalPrice = price * coffeeAmount;}

    void ppp(){
        System.out.println(string);
    }
}
