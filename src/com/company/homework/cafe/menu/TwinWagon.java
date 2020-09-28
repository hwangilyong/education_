package com.company.homework.cafe.menu;

import com.company.homework.cafe.Beans;
import com.company.homework.cafe.Coffee;

public class TwinWagon extends Coffee {
    public TwinWagon(int orderCount){
        coffeeName = "쌍화차";
        price = 1700;
        super.orderCount = orderCount;
        beans = new Beans[]{ new Beans("쌍화", 20)
        };

        calc();
        calcBeans();
    }
}
