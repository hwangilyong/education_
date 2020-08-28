package com.company.day35.work;

public class Truck extends Car{
    public Truck(int fuel, int freight, int carryCapacity) {
        super("트럭",new CarPart[]{
                new CarPart("연비", fuel,0.5 ),
                new CarPart("적재량", freight, 0.5),
                new CarPart("화물종류",carryCapacity, 1)
        });
    }
}
