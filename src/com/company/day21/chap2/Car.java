package com.company.day21.chap2;

public class Car {
    public String color;
    public int speed;

    public void upSpeed(int value){
        speed = speed + value;
    }

    public void downSpeed(int value){
        speed = speed - value;
    }
}
