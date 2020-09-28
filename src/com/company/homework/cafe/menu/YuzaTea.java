package com.company.homework.cafe.menu;

import com.company.homework.cafe.Beans;
import com.company.homework.cafe.Coffee;

public class YuzaTea extends Coffee {
    public YuzaTea(int orderCount){
        coffeeName = "유자차";
        price = 3100;
        super.orderCount = orderCount;
        beans = new Beans[]{ new Beans("유자", 25)
        };

        calc();
        calcBeans();
    }
}
