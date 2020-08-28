package com.company.day35.work;

public class Van extends Car{
    public Van(int ridingCount, int fuel, int stability) {
        super("밴", new CarPart[]{
                new CarPart("연비", fuel, 0.3),
                new CarPart("탑승인원",ridingCount, 0.3),
                new CarPart("안정성", stability, 0.4)
        });
    }
}
