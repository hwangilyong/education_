package com.company.day23.chap2;

public class Tire {
    public int maxRotation;
    public int accumulateedRotation;
    public String location;

    public Tire(String location, int maxRotation){
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll(){
        ++accumulateedRotation;

        if(accumulateedRotation < maxRotation){
            System.out.println(location + "Tire : 수명 : "
                    + (maxRotation - accumulateedRotation) + "회");

            return true;
        }else{
            System.out.println("***" + location + "Tire 펑크 ***");
            return false;
        }
    }

    public void doorState(){
        System.out.println("문이 닫힙니다.");
    }
}
