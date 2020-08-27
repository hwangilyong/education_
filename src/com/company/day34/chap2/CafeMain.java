package com.company.day34.chap2;

import java.util.Scanner;

public class CafeMain {
    public static void main(String args[]){


        while(true){
            int choice = 0;
            Scanner sc = new Scanner(System.in);

            System.out.println("################## 메뉴판 ##################");
            System.out.println("1.아메리카노   2.카페라떼   3.카라멜마끼아또   4.카페모카");
            System.out.println("#########################################");
            System.out.println();
            System.out.println("1.주문하기 2.주문 내역 3.주문한 커피 합계");

            choice = sc.nextInt();

            switch (choice){
                case 1 :
                    break;
                case 2:
                    break;
                case 6:
                    break;
            }
        }
    }
}
