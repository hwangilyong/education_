package com.company.homework;

import com.company.homework.cafe.Cafe;
import com.company.homework.cafe.Order;

public class Main {
    public static void main(String args[]){
        System.out.println("=========[ A - CAFE ] =========");
        Cafe Acafe = new Cafe();
        Acafe.order(new Order("아메리카노", 3),
                new Order("카푸치노",1));

        Acafe.order(new Order("아메리카노", 5),
                new Order("카푸치노",2),
                new Order("쌍화차", 3)
                );


        Acafe.totalUsedBeansPrint();
        Acafe.printTotalOrder();
        System.out.println("\n\n=========[ B - CAFE ] =========");

        Cafe BCafe = new Cafe();
        BCafe.order(new Order("아메리카노", 10),
                new Order("카푸치노",12));

        BCafe.order(new Order("카라멜마끼아또", 3));

        BCafe.totalUsedBeansPrint();
        BCafe.printTotalOrder();


        System.out.println("=============");
        System.out.println("[사용되어질 총 본사 원두]");
        Cafe.headBeans.ppp();
    }

}
