package com.company.day13;

import java.util.Scanner;

public class chap1 {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String inputString = scanner.nextLine();

        System.out.println("입력한 문자열 -> " + inputString);
        System.out.println();

        System.out.print("정수 입력 : ");
        int inputInt = scanner.nextInt();

        System.out.println("입력한 문자열 -> " + inputString);
    }
}
