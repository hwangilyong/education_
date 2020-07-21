package com.company.day13;

import java.util.Scanner;

public class chap5 {
    public static void main(){
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        System.out.println("이름");
        String name = scannerString.nextLine();

        System.out.println("국어");
        int korean = scannerInt.nextInt();

        System.out.println("수학");
        int math = scannerInt.nextInt();

        float avg = (float)(korean + math) / 2;

        System.out.println("이름 : " + name);
        System.out.println("국어 : " + korean);
        System.out.println("수학 : " + math);
        System.out.println("평균 : " + avg);
    }
}
