package com.company.homework2.coffee;

public class Coffee extends Recipe{
    private String coffeeName;
    private int price = 0;
    private int count = 0;

    public Coffee(String coffeeName, double beanRatio, double waterRatio, int price){
        super(beanRatio, waterRatio);
        this.coffeeName = coffeeName;
        this.price = price;
    }

    public void increaseCount(int orderCount){
        this.count += orderCount;
    }

    public String getCoffeeName(){
        return coffeeName;
    }

    public int getCount(){
        return count;
    }
}
