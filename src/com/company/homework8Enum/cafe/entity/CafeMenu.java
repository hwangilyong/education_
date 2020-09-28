package com.company.homework8Enum.cafe.entity;

public enum CafeMenu {
    AMERICANO("아메리카노",2000), ASIANO("아시아노",2300)
    ,AFRICANO("아프리카노",2700);

    private String coffeeName;
    private int coffeePrice;
    private int coffeeCount = 0;
    private int currentPrice = 0;
    private int currentCount = 0;
    private int totalPrice = 0;

    CafeMenu(String coffeeName, int coffeePrice){
        this.coffeeName = coffeeName;
        this.coffeePrice = coffeePrice;
    }

    public void add(int coffeeCount){
        this.coffeeCount += coffeeCount;
        currentCount += coffeeCount;
        currentPrice += (coffeeCount * coffeePrice);
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }

    public int getCoffeeCount(){
        return coffeeCount;
    }

    public void ppp(){
        totalPrice = coffeeCount * coffeePrice;
        System.out.println(coffeeName + " : " + coffeePrice + " " + coffeeCount + " " + totalPrice);
    }

    public void printCurrentPrice(){
        System.out.println(coffeeName + " : " + currentCount + " " + currentPrice + " ");
        currentCount = 0;
        currentPrice = 0;
    }
}

