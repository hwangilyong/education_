package com.company.homework.cafe.menu;

import com.company.homework.cafe.Beans;
import com.company.homework.cafe.Coffee;

public class Cappuccino extends Coffee {
    public Cappuccino(int orderCount){
        coffeeName = "카푸치노";
        price = 2200;
        super.orderCount = orderCount;
        beans = new Beans[]{ new Beans("원두", 15),
                             new Beans("우유", 10)};

        calc();
        calcBeans();
    }
}
