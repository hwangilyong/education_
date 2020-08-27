package com.company.day33.chap4;

public class CoffeeMain {
    public void main(){
        Coffee[] coffees = new Coffee[4];

        for(int index = 0; index < coffees.length; index++){
            coffees[index] = new Coffee();
        }

        coffees[0].init(3);
        coffees[1].init(3, 4);
        coffees[1].init(3, 4, 2);
        coffees[1].init(3, 4, true);
    }
}
