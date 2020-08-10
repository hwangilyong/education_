package com.company.day23.chap2;

public class KumhoTire extends Tire{
    public KumhoTire(String location, int maxRotation){
        super(location, maxRotation);
        doorState();
    }

    @Override
    public boolean roll(){
        ++accumulateedRotation;

        if(accumulateedRotation < maxRotation){
            System.out.println(location + "KUMHOTIRE 수명 : "
                    + (maxRotation - accumulateedRotation) + "회");

            return true;
        }else{
            System.out.println("***" + location + "KUMHOTIRE 펑크 ***");
            return false;
        }
    }

    @Override
    public void doorState(){
        System.out.println("KUMHO 문이 닫힙니다.");
    }
}
