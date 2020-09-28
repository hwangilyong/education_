package com.company.homework4Object.coffee.assembler;

import com.company.homework4Object.coffee.entity.*;

public class CoffeeAssembler {
    CoffeeData coffeeData;
    Object[] coffees;

    public void setCoffeeData(CoffeeData coffeeData){
        this.coffeeData = coffeeData;
        coffees = coffeeData.getCoffeeData();
    }

    /*
    public void order(String order, int orderCount){
        switch(order){
            case "아메리카노":
                Americano americano = (Americano) coffees[0];
                americano.order(orderCount);
                coffees[0] = americano;
                break;
            case "아프리카노":
                Africano africano = (Africano) coffees[1];
                africano.order(orderCount);
                coffees[1] = africano;
                break;
            case "아시아노":
                Asiano asiano = (Asiano) coffees[2];
                asiano.order(orderCount);
                coffees[2] = asiano;
                break;
            case "러시아노":
                Rusiano rusiano = (Rusiano) coffees[3];
                rusiano.order(orderCount);
                coffees[3] = rusiano;
                break;
            case "오세아니아노":
                Oseaniano oseaniano = (Oseaniano) coffees[4];
                oseaniano.order(orderCount);
                coffees[4] = oseaniano;
                break;
        }
    }
*/
    public void ppp(){
        for(Object object : coffees){
            System.out.println(object.toString());
        }
    }
}
