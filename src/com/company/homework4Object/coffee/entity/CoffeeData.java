package com.company.homework4Object.coffee.entity;

public class CoffeeData {
    private Object[] coffeeData = {new Americano(), new Africano(),
            new Asiano(), new Rusiano(), new Oseaniano()};

    private String[] coffeeClassInfo = new String[coffeeData.length];

    public CoffeeData(){
        for(int index = 0; index < coffeeClassInfo.length; index++){
            coffeeClassInfo[index] = coffeeData[index].getClass().getName();
        }
    }

    public Object[] getCoffeeData(){
        return coffeeData.clone();
    }

    public String[] getCoffeeClassInfo(){
        return coffeeClassInfo.clone();
    }
}
