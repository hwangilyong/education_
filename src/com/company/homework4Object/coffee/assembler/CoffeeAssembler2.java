package com.company.homework4Object.coffee.assembler;

import com.company.homework4Object.coffee.entity.CoffeeData;

public class CoffeeAssembler2 {
    private Object[] orders = {};
    private CoffeeData coffeeData;
   // private Object[] coffees;
    private String[] coffeeClassInfo;
    private int[] totalSales = new int[5];

    public void setCoffeeData(CoffeeData coffeeData){
        this.coffeeData = coffeeData;
      //  coffees = this.coffeeData.getCoffeeData();
        coffeeClassInfo = this.coffeeData.getCoffeeClassInfo();
    }


    public void order(Object coffee){
        addOrder(coffee);
        calc();
    }

    private void addOrder(Object coffee){
        Object[] buffer = new Object[orders.length + 1];

        for(int index = 0; index < orders.length; index++){
            buffer[index] = orders[index];
        }

        buffer[orders.length] = coffee;
        orders = buffer;
    }

    private void calc(){
        for(int index = 0; index < coffeeClassInfo.length; index++){
            int salesCount = 0;
            for(Object order : orders){
                if(coffeeClassInfo[index].equals(order.getClass().getName())){
                    salesCount++;
                }
            }
            totalSales[index] = salesCount;
        }

    }

    public void ppp(){
        Object[] coffees = coffeeData.getCoffeeData();
        for(int index = 0; index < coffees.length; index++){
            System.out.println(coffees[index].toString() + " " + totalSales[index]);
        }
    }
}
