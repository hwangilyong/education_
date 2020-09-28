package com.company.homework2;

import com.company.homework2.cafe.Cafe;
import com.company.homework2.cafe.Order;

public class Main {
    public static void main(String args[]){
        Cafe cafe = new Cafe();

        cafe.order(
                new Order("아메리카노", 3),
                new Order("아시아노", 4)
       );


        cafe.totalUsed();
    }
}
