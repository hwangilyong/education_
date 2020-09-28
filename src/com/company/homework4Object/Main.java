package com.company.homework4Object;

import com.company.homework4Object.coffee.assembler.CoffeeAssembler;
import com.company.homework4Object.coffee.assembler.CoffeeAssembler2;
import com.company.homework4Object.coffee.entity.Africano;
import com.company.homework4Object.coffee.entity.Americano;
import com.company.homework4Object.coffee.entity.CoffeeData;
import com.company.homework4Object.coffee.entity.Rusiano;

public class Main {
    public static void main(String args[]){
        CoffeeAssembler2 coffeeAssembler = new CoffeeAssembler2();
        CoffeeData coffeeData = new CoffeeData();

        coffeeAssembler.setCoffeeData(coffeeData);

        coffeeAssembler.order(new Americano());
        coffeeAssembler.order(new Americano());
        coffeeAssembler.order(new Africano());
        coffeeAssembler.order(new Rusiano());
        coffeeAssembler.order(new Africano());
        coffeeAssembler.order(new Rusiano());
        coffeeAssembler.order(new Africano());
        coffeeAssembler.order(new Rusiano());
        String a = "00";
        

        coffeeAssembler.ppp();
    }

    public void temp(){
        CoffeeAssembler coffeeAssembler = new CoffeeAssembler();
        CoffeeData coffeeData = new CoffeeData();

        coffeeAssembler.setCoffeeData(coffeeData);
/*
        coffeeAssembler.order("아메리카노",2);
        coffeeAssembler.order("아프리카노",3);
        coffeeAssembler.order("러시아노",3);
*/
        coffeeAssembler.ppp();
    }
}
