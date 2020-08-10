package com.company.day23;

import com.company.day23.chap2.Car;
import com.company.day23.chap2.KoreanTire;
import com.company.day23.chap2.KumhoTire;

public class Chap2 {
    public void main(){
        Car car = new Car();

        for(int index = 0; index < 5; index++){
            int problemLocation = car.run();

            switch (problemLocation){
                case 1:
                    System.out.println("앞왼쪽 HANKOOKTIRE로 교체");
                    car.frontLeftTire = new KoreanTire("앞왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 KUMHOTIRE로 교체");
                    car.frontRightTire = new KumhoTire("앞오른쪽", 13);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 HANKOOKTIRE로 교체");
                    car.backLeftTire = new KoreanTire("뒤왼쪽", 14);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 KUMHOTIRE로 교체");
                    car.backRightTire = new KumhoTire("뒤오른쪽", 15);
                    break;
                default:
                    break;
            }

            System.out.println("-----------------------------------");
        }
    }
}
