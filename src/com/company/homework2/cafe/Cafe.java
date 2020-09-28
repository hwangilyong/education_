package com.company.homework2.cafe;

import com.company.homework2.coffee.Coffee;

public class Cafe {
    private final double coffeeCC = 200;

    private Coffee[] menus = new Coffee[]{
            new Coffee("아메리카노", 0.2, 0.8,2000),
            new Coffee("아시아노", 0.3, 0.7,3000),
            new Coffee("아프리카노", 0.1, 0.9,4000),
    };

    public void order(Order... orders){
        double currentUsedBean = 0;
        double currentUsedWater = 0;

        for(Order order : orders){
            for(int index = 0; index < menus.length; index++){
                if(order.getOrderName().equals(menus[index].getCoffeeName())){
                    menus[index].increaseCount(order.getOrderCount());
                    currentUsedBean = calcUsed(menus[index].getBeanRatio(),order.getOrderCount());
                    currentUsedWater = calcUsed(menus[index].getWaterRatio(),order.getOrderCount());

                    System.out.println("현재 주문에 사용할 원두와 물의 양");
                    ppp(currentUsedBean, currentUsedWater);
                    System.out.println("");
                }
            }
        }

    }

    private double calcUsed(double ratio, int count){
        double total = coffeeCC * count;
        return total * ratio;
    }

    public void totalUsed(){
        double usedBean = 0;
        double usedWater = 0;

        for(Coffee menu : menus){
            usedBean += calcUsed(menu.getBeanRatio(), menu.getCount());
            usedWater += calcUsed(menu.getWaterRatio(), menu.getCount());
        }

        ppp(usedBean, usedWater);
    }

    private void ppp(double bean, double water){
        System.out.println("[원두:" + bean + "]" + "[물:" + water + "]");
    }
}
