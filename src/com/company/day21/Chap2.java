package com.company.day21;

import com.company.day21.chap2.Sedan;
import com.company.day21.chap2.Truck;

public class Chap2 {
    public void main(){
        Sedan sedan1 = new Sedan();
        Truck truck1 = new Truck();

        sedan1.upSpeed(300);
        truck1.upSpeed(100);

        sedan1.seatNum = 5;
        truck1.capacity = 50;

        System.out.println();
    }
}
