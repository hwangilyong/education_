package com.company.day27.service;

public class HankookTire implements Tire{
    @Override
    public void repair(){
        System.out.println("한국타이어를 교체합니다.");
    }

    @Override
    public void roll() {

    }
}
