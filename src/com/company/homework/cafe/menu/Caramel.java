package com.company.homework.cafe.menu;

import com.company.homework.cafe.Beans;
import com.company.homework.cafe.Coffee;

public class Caramel extends Coffee {
    public Caramel(int orderCount){
        coffeeName = "카라멜마끼아또";
        price = 2300;
        super.orderCount = orderCount;
        beans = new Beans[]{ new Beans("원두", 15),
                new Beans("우유", 10),
                new Beans("카라멜", 5)
        };

        calc();
        calcBeans();
    }


}
