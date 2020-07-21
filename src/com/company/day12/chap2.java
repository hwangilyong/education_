package com.company.day12;

import java.util.Scanner;

public class chap2 {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 입력하세영 : ");
        int num = scanner.nextInt();

        int sum = 0;    //합값
        int temp = 1;   //전전값
        int temp2 = 1;  // 전값

        for(int index = 0; index < num; index++){
            sum = temp + temp2; //전전값 + 전값
            temp2 = temp;       //전전값에 전값 대입
            temp = sum;         //전값에 현재값 대입

            System.out.print(sum + "\t");
        }
        System.out.println();
    }
}
