package com.company.day23.chap2;

public class KoreanTire extends Tire{
    public KoreanTire(String location, int maxRotation){
        super(location,maxRotation);
        doorState();
    }

    public boolean roll(){
        ++accumulateedRotation;

        if(accumulateedRotation < maxRotation){
            System.out.println(location + "KOREANTIRE 수명 : "
                    + (maxRotation - accumulateedRotation) + "회");

            return true;
        }else{
            System.out.println("***" + location + "KOREAN 펑크 ***");
            return false;
        }
    }

    @Override
    public void doorState(){
        System.out.println("HANKOOK 문이 닫힙니다.");
    }
}
