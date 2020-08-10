package com.company.day30;

import com.company.day30.chap1.DyCar;
import com.company.day30.chap1.DySports;
import com.company.day30.chap1.DyTruck;
import com.company.day30.chap1.DyVan;

public class Main {
    public static void main(String args[]){
        DyCar[] dyCars = {new DySports(60, 90, 91),
                new DyTruck(40, 90,"철근"),
                new DyVan(60, 90, 91),
                new DySports(90, 60, 51),
                new DyVan(90, 60, 51),
                new DyTruck(70, 50, "물", "기름", "철근"),
                new DyTruck(70, 50,"나무")};

        for(int index = 0; index < dyCars.length; index++){
            dyCars[index].drive(10);
        }
    }
}
