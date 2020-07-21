package com.company.day12;


import java.io.IOException;
import java.util.Scanner;

public class chap1 {


    public static void main() throws IOException {
        Scanner sc = new Scanner(System.in);
        String integerCollection = "";

        System.out.println("5자리 정수를 입력하세요");

        integerCollection = integerCollection + sc.nextInt();
        int integerAmount = integerCollection.length();

        int index = 0;
        while(index != (0 + integerAmount)/2 + 1){
            if(integerCollection.charAt(index) != integerCollection.charAt((integerAmount - 1) - index)){
                System.out.println(integerCollection + " 회문수가 아닙니다.");
                break;
            }

            index++;
            if(index == (0 + integerAmount)/2 + 1)
                System.out.println(integerCollection + " 회문 수 입니다.");
        }
    }
}
