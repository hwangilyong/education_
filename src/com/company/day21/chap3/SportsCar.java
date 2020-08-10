package com.company.day21.chap3;

public class SportsCar extends Car{
    private int select;
    private String name;

    public void setSelect(int select){
        this.select = select;
    }

    @Override
    public void run(){
        if(1 == select){
            name = "스포츠카가 출발합니다.";
            System.out.println(name);
        }
        else if(2 == select)super.run();
    }
}
