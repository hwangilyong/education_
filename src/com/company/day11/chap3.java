package com.company.day11;

import java.io.IOException;

public class chap3 {
    public static void main() throws IOException {
        int speed = 0;

        for(int keyCode = System.in.read(); keyCode != 51;){
            if(keyCode != 13 && keyCode != 10) {
                System.out.println("=====================");
                System.out.println("1. 증속 | 2. 감속 | 3. 중지");
                System.out.println("=====================");
                System.out.print("선택 : ");
            }

            if(keyCode == 49){
                speed++;
                System.out.println("속도 : " + speed);
            }
            else if(keyCode == 50){
                speed--;
                System.out.println("속도 : " + speed);
            }
        }
//        boolean run = true;
//        int speed = 0;
//        int keyCode = 0;
//
//        while(run){
//            if(keyCode != 13 && keyCode != 10) {
//                System.out.println("=====================");
//                System.out.println("1. 증속 | 2. 감속 | 3. 중지");
//                System.out.println("=====================");
//                System.out.print("선택 : ");
//            }
//
//            //키보드의 입력값을 받음
//            keyCode = System.in.read();
//
//            if(keyCode == 49){
//                speed++;
//                System.out.println("속도 : " + speed);
//            }
//            else if(keyCode == 50){
//                speed--;
//                System.out.println("속도 : " + speed);
//            }
//            else if(keyCode == 51)run = false;
//        }
//    }
    }
}
