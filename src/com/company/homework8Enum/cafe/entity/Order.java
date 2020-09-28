package com.company.homework8Enum.cafe.entity;

public class Order {
    private String coffeeName;
    private int coffeeCount;

    public Order(String coffeeName, int coffeeCount){
        this.coffeeName = coffeeName;
        this.coffeeCount = coffeeCount;
    }

    public String getCoffeeName(){
        return coffeeName;
    }

    public int getCoffeeCount(){
        return coffeeCount;
    }
}
