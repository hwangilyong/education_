package com.company.day35.work;

public class Sports extends Car{
    public Sports(int speed, int fuel) {
        super("스포츠카",new CarPart[]{
                new CarPart("속도", speed, 0.6),
                new CarPart("연비", fuel, 0.4)
        });
    }
}
