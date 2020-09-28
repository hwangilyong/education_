package com.company.homework.cafe.menu;

import com.company.homework.cafe.Beans;
import com.company.homework.cafe.Coffee;

public class Americano extends Coffee {
    public Americano(int orderCount){
        coffeeName = "아메리카노";
        price = 2000;
        super.orderCount = orderCount;
        beans = new Beans[]{new Beans("원두", 20)};

        calc();
        calcBeans();
    }
}
