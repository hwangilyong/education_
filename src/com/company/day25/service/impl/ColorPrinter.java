package com.company.day25.service.impl;

import com.company.day25.service.Printable;

public class ColorPrinter implements Printable {
    private int number;

    @Override
    public void print(){
        System.out.println("컬러모드로 인쇄합니다.");
    }

    @Override
    public void copy(){
        System.out.println("컬러모드로 복사합니다.");
    }

    @Override
    public void output(int number){
        if(number > 0 && number <= 20){
            this.number = number;
        }else{
            this.number = 0;
        }

        System.out.println("컬러모드로" + this.number + "매를 출력합니다.");
    }
}
